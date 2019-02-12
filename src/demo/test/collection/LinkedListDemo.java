package demo.test.collection;

import java.util.Iterator;
import java.util.LinkedList;

class Page
{
	String title;
	String characterSet;
	String url;
}

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("AAAA");
		list.add("BBBB");
		list.add("CCCC");
		list.add("DDDD");
		list.add("EEEE");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " - > ");
			

		}

		System.out.println("Size = " + list.size());
		System.out.println("First Element = " + list.getFirst());
		System.out.println("Last Element = " + list.getLast());
		
		
		LinkedList<Page> pageLink = new LinkedList<Page>();
		
		
	}
}
