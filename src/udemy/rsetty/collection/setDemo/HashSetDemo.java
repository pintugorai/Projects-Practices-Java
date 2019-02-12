package udemy.rsetty.collection.setDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	// HashSet, TreeSet, LinkedHasSet implements set interface
	//Features of set interfaces - 
	//does not accepts duplicate value
	// there is not guarantee that element stored in sequential order
	
	// HashSet demo
	
	
	public static void hashsetMethod()
	
	{
	
	HashSet<String> hs = new HashSet<String>();
	hs.add("Java");
	hs.add("Python");
	hs.add("java;");
	hs.add("C++");
	hs.add("MP");
	System.out.println("hs = ==============" + hs);
	
	hs.remove("MP");
	System.out.println("hs = ==============" + hs);
	hs.remove("python");
	System.out.println("hs = ==============" + hs);
	
	System.out.println("hs.isEmpty() = ==============" + hs.isEmpty());
	
	System.out.println("hs.size() = ==============" + hs.size());
	
	System.out.println("hs = ==============" + hs);
		
	}
	
	// Iterator - it is an interface which help us to traverse through each elements in a set.
	public void iteratorMethod1()
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		
		Iterator i = hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
	
	public static void main(String[] args)
	{
		//hashsetMethod();
		
		HashSetDemo h = new HashSetDemo();
		h.iteratorMethod1();
	}
	
}
