package udemy.rsetty.collection.listDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Java");
		a.add("Python");
		a.add("Java"); // it accepts duplicate values
		a.add("Python");
		System.out.println("a = " + a);
		
		a.add(0, "Core Java");
		System.out.println("a = " + a);
		
		a.remove(1);
		System.out.println("a = " + a);
		a.remove("Java");
		System.out.println("a = " + a);
		
		String getValue = a.get(1);
		
		System.out.println("getValue = " + getValue);
		
		Boolean isPresentJava = a.contains("Java");
		System.out.println("isPresentJava = " + isPresentJava);
		
		int getIndexOfCoreJava = a.indexOf("Core Java");
		System.out.println("getIndexOfCoreJava = " + getIndexOfCoreJava);
		
		int getIndexOfcorecava = a.indexOf("core java"); // To check case sensitivity 
		System.out.println("getIndexOfcorecava = " + getIndexOfcorecava);
		
		System.out.println("a.isEmpty() = " + a.isEmpty());
		
		System.out.println("a.size() = " + a.size());
		
		
	}

}
