package demo.test.polymorphism;

 class SuperClass
{
	public void show()
	{
		System.out.println("Show- Superclass");
	}
}

 class SubClass extends SuperClass
 {
	 public void show()
	 {
		 //super.show();
		 System.out.println("Show- Subclass");
	 }
 }
public class Overriding{
	
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		
		sub.show();
	}

	
}
