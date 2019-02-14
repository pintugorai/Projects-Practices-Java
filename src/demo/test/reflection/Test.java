package demo.test.reflection;

public class Test {
	// creating a private field
	private String s;

	// creating a public constructor
	public Test() {
		s = "Pintu";
	}

	// Creating a public method with no arguments
	public void method1() {
		System.out.println("Method1: The string is " + s);
	}

	public void method11() {
		System.out.println("method11");
	}

	// Creating a public method with int as argument
	public void method2(int n) {
		System.out.println("The number is = " + n);
	}

	// creating a private method
	private void method3() {
		System.out.println("Private method invoked");
	}
}
