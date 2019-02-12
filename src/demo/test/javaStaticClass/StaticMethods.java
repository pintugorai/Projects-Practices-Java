package demo.test.javaStaticClass;

class OtherClass
{
	public static void staticMethod1()
	{
		System.out.println("Other Class - staticMEthod1()");
	}
}
public class StaticMethods {

	int intVar = 5;
	static int staticIntVar = 10;

	public void method1() {
		if (intVar == 5) {
			intVar++;
			method1();
			System.out.println("intVar = " + intVar);
		}
		System.out.println("Non-Static method-1");
	}

	public static void staticMethod1() {
		if (staticIntVar == 10) {
			staticIntVar++;
			staticMethod1();
			System.out.println("staticIntVar = " + staticIntVar);
		}
		System.out.println("Static method-1");
	}

	public void method2() {
		System.out.println("intVar = " + intVar);
		System.out.println("staticIntVar = " + staticIntVar);
		System.out.println("Non-Static method-2");
	}

	public static void staticMethod2() {
		// System.out.println("intVar = " + intVar); // cannot access
		System.out.println("Static method-2=" + staticIntVar);
	}

	public static void main(String[] args) {
		// method(); // non-static membes cannot be access without creating objects
		staticMethod1();

		// Accessing non-static methods
		new StaticMethods().method1();

		new StaticMethods().method2();

		staticMethod2();
		
		OtherClass.staticMethod1();

	}

}
