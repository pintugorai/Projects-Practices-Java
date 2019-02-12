package demo.test.SaturdaySunday;

class A{
	public void show()
	{
		System.out.println("A show");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("B show");
	}
}
public class Overriding {

	public static void main(String[] args) {
		B o = new B();
		o.show();
		
		A a = new A();
		a.show();
		
		//B o2 = (B) new A();	 //Exception in thread "main" java.lang.ClassCastException: demo.test.SaturdaySunday.A cannot be cast to demo.test.SaturdaySunday.B
		//o2.show();				// at demo.test.SaturdaySunday.Overriding.main(Overriding.java:26)

		
		
		A a2 = new B();
		a2.show();
	/*	
		B b2 = (B) new A();
		b2.show();
		*/
	}
	
}
