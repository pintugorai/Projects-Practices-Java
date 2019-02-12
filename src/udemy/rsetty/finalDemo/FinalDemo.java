package udemy.rsetty.finalDemo;

/*
 * final variable = Create constant variables
 * final methods = prevent method overriding
 * final classes = prevent inheritance
*/

public class FinalDemo extends PatentClass{
	final int I = 10;
	
	public void finalVeriable()
	{
		// I=20; 
	}

	
	public void getData()
	{
		System.out.println("I am in child");
	}
	
	
	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.getData();
		fd.finalVeriable();
		
		DiffPackageAccess d = new DiffPackageAccess();
		d.getValue();
		udemy.rsetty.superDemo.DiffPackageAccess d1 = new udemy.rsetty.superDemo.DiffPackageAccess();
		d1.getValue();
		
		
	}
}
