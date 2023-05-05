# Maps and Immutability

<h1>Text-based game using Maps</h1>
  
  This is an Adventure game using HashMap. The game start with the player standing on the center of a Map and you will able to move from there. This programs takes entire phrases containing the words South,North,East, or West. It will also take just the initials S,N,E,W. Let’s see some gameplay example and then let’s discuss the techniques used in this project. 
  
<p>
<img src="https://i.imgur.com/Zm1SvS4.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
</p>
  
  
  <h1> HashMaps in Java  </h1>
  
 The map interface is present in java.util package represents a mapping between a key and a value. The Map interface is not a subtype of the Collection interface. Therefore it behaves a bit differently from the rest of the collection types. A map contains unique keys and a value. A HashMap is an implementation of Map where we have key/value pair in the position given by the Hash. The syntax to create a HashMap is:

```java
import java.util.HashMap; // import the HashMap class
HashMap<String, String> mapName = new HashMap<String, String>();
```
Note that this is a map made of Strings, but we can use any combination of Objects that we want. We can not use primitive types like int but we can use its wrapper class Integer, this is also true for other primate types. Now let's see some methods to add, retrieve,  and remove items isnside our HashMap.


**add item to HashMap:**

```java
mapName.put("this is the key","This is the value");
mapName.put("another key","another value");
mapName.put("key","value");
```

**get value of given key in a HashMap:**

```java
mapName.get("key");
```

**Remove key/item pair:**

```java
mapName.remove("this is the key");
```

**How to iterate through a HashMap:**
```java
for(String curr: mapName.keySet()){
    System.out.println("current key: " + curr + " current value: " + mapName.get(curr));
}
````
<h1>Why should we use hashmaps?</h1>

HashMaps are very useful because retrieving data from them is O(1). This is because we use a hash to allocate the keys. In contrast to an Array where we have to go through the entire array to know if a value is in it O(n), HashMaps are very fast and as I said before give us a the solution in O(1). This are some properties of a HashMap: 

1. Fast access time: HashMaps provide constant time access to elements, which means that retrieval and 2insertion of elements is very fast, usually O(1) time complexity
2. Insertion of elements is very fast, usually O(1) time complexity.
3. Uses hashing function: HashMaps use a hash function to map keys to indices in an array. This allows for quick lookup of values based on keys.
4. Stores key-value pairs: Each element in a HashMap consists of a key-value pair. The key is used to look up the associated value.
5. Supports null keys and values: HashMaps allow for null values and keys. This means that a null key can be used to store a value, and a null value can be associated with a key.
6. Not ordered: HashMaps are not ordered, which means that the order in which elements are added to the map is not preserved. However, LinkedHashMap is a variation of HashMap that preserves the insertion order.
7. Allows duplicates: HashMaps allow for duplicate values, but not duplicate keys. If a duplicate key is added, the previous value associated with the key is overwritten.
8. Thread-unsafe: HashMaps are not thread-safe, which means that if multiple threads access the same hashmap simultaneously, it can lead to data inconsistencies. If thread safety is required, ConcurrentHashMap can be used.
9. Capacity and load factor: HashMaps have a capacity, which is the number of elements that it can hold, and a load factor, which is the measure of how full the hashmap can be before it is resized.

  <h1> Immutability:  </h1>
  
  Immutable class in java means that once an object is created, we cannot change its content. In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable. We can create our own immutable class as well. Prior to going ahead do go through characteristics of immutability in order to have a good understanding while implementing the same. Following are the requirements: 
  
  
- The class must be declared as final so that child classes can’t be created.
- Data members in the class must be declared private so that direct access is not allowed.
- Data members in the class must be declared as final so that we can’t change the value of it after object creation.
- A parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified with an object reference.
- Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference)

We can see a an example of Deep copy in out adventure game project:

```java
public Map<String,Integer> getExits(){
    return new HashMap<String,Integer>(exits);
}
```

In this method, we are returning a copy of the exits, we are not actually passing the exits object itself, this is to prevent an instance changing the HashMap. 

</br>




