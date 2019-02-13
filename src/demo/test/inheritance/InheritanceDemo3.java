package demo.test.inheritance;

class Superclass3
{
	// No default constructor
	Superclass3()
	{
		System.out.println("Superclass default constructor");
	}
	Superclass3(int x)
	{
		System.out.println("Superclass: x = " + x);
	}
	public void toy()
	{
		System.out.println("This is toy");
	}
}

class Subclass3 extends Superclass3
{
	
	//Illegal modifier for the constructor in type Subclass3; only public, protected & private are permitted
	static Subclass3()
	{
		super(); // if you not write here it will invoke by compiler
		System.out.println("Subclass3 default constructor");
	}
	final Subclass3(int x)
	{
		System.out.println("Subclass3: x = " + x);
	}
	
	abstruct Subclass3(float x, int y) {}
	/*{
		super(y);
		System.out.println("Subclass3: x(float)(int) = " + x);
	}
	*/
}


public class InheritanceDemo3 {
	public static void main(String[] args) {
		System.out.println("\nSubclass obj1");
		Subclass3 s = new Subclass3();
		
		System.out.println("\nSubclass obj2");
		Subclass3 t = new Subclass3(2);
		
		System.out.println("\nSubclass obj3");
		Subclass3 u = new Subclass3(3,4);
		
		System.out.println("\nSubclass obj4");
		Subclass3 v = new Subclass3(2.5f,25);
		
	}
}
