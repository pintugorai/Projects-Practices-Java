package udemy.rsetty.superDemo;

public class DiffPackageAccess {
	public void getValue()
	{
			
		System.out.println("I am in different package > DiffPackageAccess > getValue");
	}
}

/*abstract class x extends DiffPackageAccess
{
	public void name() {
		System.out.println("I am in different package > DiffPackageAccess > getValue");
	}
	abstract void draw();
}

*/