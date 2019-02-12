package udemy.rsetty.collection.mapDeom;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/*
 * Difference between hashmap and hashtable?

HashMap  is non synchronized and not thread safe.
HashTable is thread safe and synchronized.
HashMap- allows one null key and any number of null values.
HashTable - do not allow null keys and null  values in the HashTable object.
HashMap  - HashMap  object values are iterated by using iterator.
HashTable - HashTable is the only class other than vector which uses enumerator to iterate the values of HashTable object.

 */

// hashTableMethod - incomplete
public class HashMapDemo {

	// hash map demo
	public void hashMapMethod() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(0, "Zero");
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(44, "Four");
		hm.put(5, "Five");

		System.out.println("2 = " + hm.get(2));

		System.out.println("Not present 100 = " + hm.get(100));

		System.out.println("Before remove 3 = " + hm.get(3));
		hm.remove(3);

		System.out.println("After remove 3 = " + hm.get(3));

		// Converet to set

		Set sn = hm.entrySet();

		Iterator it = sn.iterator();

		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey() + " - > " + mp.getValue());
		}

	}

	// hash table demo
	public void hashTableMethod() {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(0, "Zero");
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(44, "Four");
		hm.put(5, "Five");

		System.out.println("2 = " + hm.get(2));

		System.out.println("Not present 100 = " + hm.get(100));

		System.out.println("Before remove 3 = " + hm.get(3));
		hm.remove(3);

		System.out.println("After remove 3 = " + hm.get(3));

		// Converet to set

		Set sn = hm.entrySet();

		Iterator it = sn.iterator();

		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey() + " - > " + mp.getValue());
		}

	}
	public static void main(String[] args) {

		HashMapDemo h = new HashMapDemo();
		//h.hashMapMethod();
		h.hashTableMethod();
	}

}
