package demo.test.javaStaticClass;


// Static block will execute during class loading in memory. static will execute before main function.

public class StaticBlocks {
	
	static int staticVar1=5;
	
	// Static block 1
	static {
		staticVar1 = 1;
		System.out.println("Static block 1, staticVar1 = " + staticVar1);
	}
	
	// Static block 2
	static {
		staticVar1 = 2;
		System.out.println("Static block 2, staticVar1 = " + staticVar1);
	}
	
	// Static block 3
	static {
		staticVar1 = 3;
		System.out.println("Static block 3, staticVar1 = " + staticVar1);
	}
	
	public static void main(String[] args) {
		System.out.println("In main");
	}
	
	// Static block 4
	static {
		staticVar1 = 4;
		System.out.println("Static block 4, staticVar1 = " + staticVar1);
	}
	
	// Static block 5
	static {
		staticVar1 = 5;
		System.out.println("Static block 5, staticVar1 = " + staticVar1);
	}
	

}
