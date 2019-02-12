package demo.test.collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

public class OneArrayListDemo {

	public void genericArrayList() {

		// Java collection framework was non-generic before JDK 1.5. Since 1.5, it is
		// generic.
		// In generic collection, we specify the type in angular braces.

		ArrayList<String> alist = new ArrayList<String>(); // Creating arraylist

		alist.add("Pintu"); // Adding object in arraylist
		alist.add("Gorai");
		alist.add("Java");
		alist.add("Selenium");
		alist.add("TestNG");
		alist.add("Jenkins-continuous integration");
		alist.add("gradle");

		int size = alist.size();

		// There are two ways to traverse collection elements:

		// 1. By Iterator interface.
		// 2. By for-each loop.

		// 1. Traversing list through Iterator
		Iterator itr = alist.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// 2. By for-each loop
		for (String item : alist) {
			System.out.println("For-Each: " + item);
		}

		// MySelf
		for (int i = 0; i < size; i++) {
			System.out.println(alist.get(i));
		}

	}

	public void nonGenericArraylist() {
		// Java collection framework was non-generic before JDK 1.5. Since 1.5, it is
		// generic.

		ArrayList<String> alist = new ArrayList();// creating old non-generic arraylist

		alist.add("Pintu"); // Adding object in arraylist
		alist.add("Gorai");
		alist.add("Java");
		alist.add("Selenium");
		alist.add("TestNG");
		alist.add("Jenkins-continuous integration");
		alist.add("gradle");

		int size = alist.size();

		// Traversing list through Iterator
		Iterator itr = alist.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	// Allarlist of objects
	public void userDefineArraylist() {
		// Creating user-defined class objects
		Student s1 = new Student(101, "Sonoo", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Hanumat", 25);
		// creating arraylist
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);// adding Student class object
		al.add(s2);
		al.add(s3);
		// Getting Iterator
		Iterator itr = al.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

	public static void main(String[] args) {

		OneArrayListDemo obj = new OneArrayListDemo();
		obj.genericArrayList();
		;

		System.out.println("Non-Generic Arraylist");
		obj.nonGenericArraylist();

		// User-defined class objects in Java ArrayList
		System.out.println("User-defined class objects in Java ArrayList");
		obj.userDefineArraylist();
	}

}
