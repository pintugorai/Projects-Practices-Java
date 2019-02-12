package demo.test.javaStaticClass;
/*
 * Top-Level class cannot be static.
 * 
 * Nested Class can be static or non-static.
 * Example of nested static class.
*/
public class StaticClass1 {
	
	public static class NestedStatic1{
		int  x=5;
		String name= "Name1";
		
		public void showStatic1()
		{
			System.out.println("x = " + x);
			System.out.println("Name = " + name);
		}
	}
	
	public static void main(String[] args)
	{
		//NestedStatic1.s
	}
}
