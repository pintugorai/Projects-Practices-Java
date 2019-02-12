package demo.test.collection;

import java.util.Vector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IteratorDemo{
	
	private static void iteratorPrint(Collection<Object> c)
	{
		System.out.println("Start: Inside iterator methods.");
		Iterator itr = c.iterator();
		
		System.out.println("End: Inside iterator methods.");
	}
	
	private static void vectorDemo()
	{
		// Enumeration

				Vector v = new Vector();
				for (int i = 0; i < 10; i++)
					v.addElement(i);
				/*
				 * Enumeration eV = v.elements(); while(eV.hasMoreElements()) {
				 * 
				 * }
				 */
				System.out.println(v);

				Iterator itr = v.iterator();
				
				while (itr.hasNext()) {
					int ele = (int) itr.next();
					if (ele % 2 == 0)
						itr.remove();

				}

				System.out.println(v);
	}
	
	private static void listDemo()
	{
		// ArrayList - Duplicate, position, default add at end if not position is mentions
		// insettion and deletion is slow
		ArrayList<String> al = new ArrayList<String>();
		al.add("One");
		al.add("two");
		System.out.println("al= " + al);
		
		al.add(0, "Zero");
		System.out.println("al= " + al);
		
		al.add(1, "one-New");
		System.out.println("al= " + al);
		
		al.add("One");
		al.add("duplicate");
		al.add("duplicate");
		System.out.println("al= " + al);
		
		// LinkedList
		System.out.println("LinkedList Demo");
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("One");
		ll.add("One");
		System.out.println("ll= " + ll);
		
		ll.add(0, "zero");
		System.out.println("ll= " + ll);
		
		ll.addAll(al);
		System.out.println("ll= " + ll);
		 
		//Stack
		System.out.println("Stack overview");
		Stack<String> s = new Stack<String>();
		
		s.push("One");
		s.push("Two");
		System.out.println("stack= " + s);
		
		s.push("three");
		System.out.println("stack= " + s);
		
		s.pop();
		System.out.println("stack= " + s);
		s.pop();
		System.out.println("stack= " + s);
		
		s.peek();
		System.out.println("stack= " + s);
	
		// Queue
	/*	System.out.println("Queue overview");
		Queue<String> q = new QA2Queue<String>();
		
		q.add("one");
		System.out.println("Queue= " + q);
		
		q.add("three");
		System.out.println("Queue= " + q);*/
		
	
		
	}


	public static void main(String[] args) {
		
		//vectorDemo();
		listDemo();
	}
}
