package demo.test.SaturdaySunday;

class TopLevel {
	public static class NestedClass {
		public static void method() {
			System.out.println("This is static method.");
		}
	}

	public class Class2 {
		public void method2() {
			System.out.println("method 2");
		}

	}

	Class2 c2 = new Class2();
}

public class StaticPractics {

	static int i;
	static String str = "initial";

	static {
		i = 10;
		str = "ini";
	}

	public static void staticMethod() {
		System.out.println("This is static method.");
	}

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(str);
		staticMethod();

		TopLevel.NestedClass.method();
		TopLevel t = new TopLevel();
		t.c2.method2();
	}
}
