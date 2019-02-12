package demo.test.javaStaticClass;

/**
 * @author Pintu Gorai 
 * Non-Static nested inner class theree types - 
 * 1. Inner Class
 * 2. Method-local Inner Class 
 * 3. Anonymous Inner Class
 *  https://www.tutorialspoint.com/java/java_innerclasses.htm
 */

//1. inner calss example
class OuterClass1 {
	int n;
	
	// private
	private class InnerClass {
		public void show() {
			System.out.println("Inside the inner class. ");
		}
	}
	
	//public 
	public class InnerClassPublic
	{
		public void show()
		{
			System.out.println("Inside the innerclass public. ");
		}
	}

	public void display() {
		System.out.println("Inside display method under OuterClass1. ");
		InnerClass nc = new InnerClass();
		nc.show();
	}
}

//2. method local innerr class example


public class NestedClassNonStatic {

	public static void main(String[] args) {
		
		// Accessing inner class 
		
		OuterClass1 outer1 = new OuterClass1();
		outer1.display();
		
		OuterClass1.InnerClassPublic obj1 = outer1.new InnerClassPublic();
		obj1.show();
		
		OuterClass1.InnerClassPublic obj2 = new OuterClass1().new InnerClassPublic();
		obj2.show();
		
	}
}
