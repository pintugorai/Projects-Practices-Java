package udemy.rsetty.superDemo;

public class ChildDemo extends ParentDemo{
	
	public ChildDemo()
	{
		//super(); // super() must be at the first line.
		System.out.println("Child class constructor");
		
	}
	public void method1()
	{
		super.method1(); // access method of parent class
		String strSuper="Child Demo Class Variable";
		System.out.println(strSuper);
		System.out.println(super.strSuper); // access variable of parent class.
		//super.method1();
		
	}
	
	public static void main(String[] args) {
		
	 ChildDemo cd = new ChildDemo();
	 cd.method1();
	 
	 
	 ChildDemo cd1 = new ChildDemo();
	 
	}

}
