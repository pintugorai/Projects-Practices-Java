package demo.test.javaStaticClass;
/**
 * @author Pintu Gorai
 *
 */
class TopLevel
{
	static class StaticNestedClass1
	{
		public void method1()
		{
			System.out.println("Inside Static NestedClass1-method1()");
		}
		
		public static void static_method1()
		{
			System.out.println("Inside Static Nested Class1- static_method1()");
		}
	}
}

public class StaticNestedClass1 {

	public static void main(String[] args) {
		TopLevel.StaticNestedClass1 obj = new TopLevel.StaticNestedClass1();
		obj.method1();
		
		TopLevel.StaticNestedClass1.static_method1(); // No need to created instance of the class.
		
	}
}
