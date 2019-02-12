package udemy.rsetty.accessSpecifiers;

public class Parent {

	int defaultVar=10;
	private int privateVar=20;
	protected int protectedVar=30;
	public int publicVar=40;
	
	void defaultMethod()
	{
		System.out.println("I am defalut method");
	}
	private void privateMethod()
	{
		System.out.println("I am private method");
	}
	protected void protectedMethod()
	{
		System.out.println("I am protected method");
	}
	public void publicMethod()
	{
		System.out.println("I am public method");
	}
}
