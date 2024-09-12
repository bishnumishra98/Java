// A Map is a powerful data structure for storing key-value pairs and performing quick lookups based on keys. The most common
// operations like adding, removing, and searching for elements are fast, especially in a HashMap, which is one of the most
// commonly used implementations.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class M2_MapMethods {
    public static void main(String[] args) {
        // 1. Creating a map
        Map<Integer, String> map = new HashMap<>();
        
        // 2. put(key, value): Adds or updates a key-value pair in the map.
        map.put(1, "Vishnu");
        map.put(2, "Disha");
        map.put(3, "Jeet");

        // 3. get(key): Returns the value associated with the given key, or null if the key is not present.
        System.out.println(map.get(1));   // o/p: Vishnu

        // 4. remove(): Removes the key-value pair associated with the specified key from the map.
        map.remove(2); 
        System.out.println(map);   // o/p: {1=Vishnu, 3=Jeet}

        // 5. containsKey(): Checks if key exists in map.
        System.out.println(map.containsKey(3));   // o/p: true

        // 6. keySet(): Returns a Set of all the keys in the map.
        Set<Integer> keys = map.keySet();
        System.out.println(keys);   // o/p: [1, 3]

        // 7. values(): Returns a Collection of all the values in the map.
        System.out.println(map.values());   // o/p: [Vishnu, Jeet]

        // 8. size(): Returns the number of key-value pairs in the map.
        System.out.println(map.size());   // o/p: 2

        // 9. isEmpty(): Checks if the map is empty.
        System.out.println(map.isEmpty());   // o/p: false

        // 10. replace(): replaces the value if the key is present in the map.
        map.replace(1, "Krishna");
        System.out.println(map);   // o/p: {1=Krishna, 3=Jeet}

        // 11. clear(): Removes all key-value pairs from the map.
        map.clear();
        System.out.println("After clear, is map empty ? " + map.isEmpty());   // o/p: true
    }
}
