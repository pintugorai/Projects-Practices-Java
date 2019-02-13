package demo.test.inheritance;

class Superclass
{
	// No default constructor
	Superclass(int x)
	{
		System.out.println("Superclass: x = " + x);
	}
	public void toy()
	{
		System.out.println("This is toy");
	}
}

// Implicit super constructor Superclass() is undefined for default constructor. 
//Must define an explicit constructor

class Subclass extends Superclass
{
	
	
	
}

/*
 * in Superclass - no default constructor, only constructor
 * in subclass - it will throw a compiler error
 */
public class InheritanceDemo1 {

}
