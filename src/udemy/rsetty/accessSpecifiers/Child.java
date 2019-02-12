package udemy.rsetty.accessSpecifiers;

public class Child {

	public static void main(String[] args) {

		Parent p = new Parent();
		
		
		// Printing variables
		System.out.println(p.defaultVar);
		System.out.println(p.protectedVar);
		System.out.println(p.publicVar);
		//System.out.println(p.privateVar); // not accessible
		
		p.defaultMethod();
		p.protectedMethod();
		p.publicMethod();
		
		//p.privateMethod(); // not accessible 
	}

}
