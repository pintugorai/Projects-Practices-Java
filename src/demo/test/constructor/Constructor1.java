package demo.test.constructor;
// Can be constructor inherited?
class Parent
{
	int x;
	Parent()
	{
		x=1;
		System.out.println("Parent default");
	}
	
	Parent(int a)
	{
		x=a;
		System.out.println("Parent parameterized");
	}
	
	public void displayParent()
	{
		System.out.println("Parent display, x = " + x);
	}
}

public class Constructor1 extends Parent{
	
	public static void main(String args[])
	{
	Constructor1 A = new Constructor1();
	A.displayParent();
	
	Constructor1 B = new Constructor1();
	B.displayParent();
	}

}
