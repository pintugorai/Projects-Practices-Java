package demo.test.inheritance;

class Superclass1
{
	// No default constructor
	Superclass1()
	{
		System.out.println("Superclass default constructor");
	}
	Superclass1(int x)
	{
		System.out.println("Superclass: x = " + x);
	}
	public void toy()
	{
		System.out.println("This is toy");
	}
}

class Subclass1 extends Superclass1
{
	Subclass1()
	{
		System.out.println("Subclass1 default constructor");
	}
	Subclass1(int x)
	{
		System.out.println("Subclass1: x = " + x);
	}
	
	
}

/*
 * When you create a subclass objects with no argument it will call subclass constructor, 
 * then the compiler automatically invoke a default constructor of superclass.
 * eg- 
 * 1. in main()
 * Subclass1 s = new Subclass1();
 * 2. in will call subclass1 constructor 
 * 3. As compiler invoke super() in sublcass default constructor, means
 * Subclass1()
	{
		super()
		System.out.println("Subclass1 default constructor");
	}
 * it will call super class default constructor
 */
public class InheritanceDemo2 {
	public static void main(String[] args) {
		Subclass1 s = new Subclass1();
	}
}
