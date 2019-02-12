package demo.test.inheritance;

class Superclass2
{
	// No default constructor
	Superclass2()
	{
		System.out.println("Superclass default constructor");
	}
	Superclass2(int x)
	{
		System.out.println("Superclass: x = " + x);
	}
	public void toy()
	{
		System.out.println("This is toy");
	}
}

class Subclass2 extends Superclass2
{
	Subclass2()
	{
		super(); // if you not write here it will invoke by compiler
		System.out.println("Subclass2 default constructor");
	}
	Subclass2(int x)
	{
		System.out.println("Subclass2: x = " + x);
	}
	
	Subclass2(float x, int y)
	{
		super(y);
		System.out.println("Subclass2: x(float)(int) = " + x);
	}
	
}

/*
 * When you create a subclass objects with no argument it will call subclass constructor, 
 * then the compiler automatically invoke a default constructor of superclass.
 * eg- 
 * 1. in main()
 * Subclass2 s = new Subclass2();
 * 2. in will call Subclass2 constructor 
 * 3. As compiler invoke super() in sublcass default constructor, means
 * Subclass2()
	{
		super()
		System.out.println("Subclass2 default constructor");
	}
 * it will call super class default constructor
 */
public class InheritanceDemo2_1 {
	public static void main(String[] args) {
		System.out.println("\nSubclass obj1");
		Subclass2 s = new Subclass2();
		
		System.out.println("\nSubclass obj2");
		Subclass2 t = new Subclass2(2);
		
		System.out.println("\nSubclass obj3");
		Subclass2 u = new Subclass2(3,4);
		
		System.out.println("\nSubclass obj4");
		Subclass2 v = new Subclass2(2.5f,25);
		
	}
}
