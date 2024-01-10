package com.setassignment;

import java.util.HashSet;

/*
 * 61. Create hashset of 5 strings. Serialize and deserialize hashset
 */

//public class Q61 {
//
//	public static void main(String[] args) {
//		
//	HashSet<String> animal=new HashSet<String>();
//		
//		animal.add("lion");
//		animal.add("tiger");
//		animal.add("elephnat");
//		animal.add("fox");
//		animal.add("wolf");
//		
//	
//	
//	}
//}
//



public class Q61SerializeDeserializeHashSet  {
	
	

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Orange");
        hs.add("Grapes");
        hs.add("Cherry");
        
       

	}

}

//
//public class SerializeDeserializeHashSet {
//
//    public static void main(String[] args) {
//        // Create a HashSet of strings
//        HashSet<String> stringHashSet = new HashSet<>();
//        stringHashSet.add("Apple");
//        stringHashSet.add("Banana");
//        stringHashSet.add("Orange");
//        stringHashSet.add("Grapes");
//        stringHashSet.add("Cherry");
//
//        // Serialize the HashSet
//        serializeHashSet(stringHashSet, "hashSetSerialized.ser");
//
//        // Deserialize the HashSet
//        HashSet<String> deserializedHashSet = deserializeHashSet("hashSetSerialized.ser");
//
//        // Print the original and deserialized HashSet
//        System.out.println("Original HashSet: " + stringHashSet);
//        System.out.println("Deserialized HashSet: " + deserializedHashSet);
//    }
//
//    private static void serializeHashSet(HashSet<String> set, String fileName) {
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
//            outputStream.writeObject(set);
//            System.out.println("HashSet serialized successfully.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static HashSet<String> deserializeHashSet(String fileName) {
//        HashSet<String> deserializedSet = null;
//        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
//            deserializedSet = (HashSet<String>) inputStream.readObject();
//            System.out.println("HashSet deserialized successfully.");
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return deserializedSet;
//    }
//}
