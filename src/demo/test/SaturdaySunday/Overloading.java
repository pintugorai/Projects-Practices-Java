package demo.test.SaturdaySunday;

class Topclass {
	public void area() {
		System.out.println("void area");
	}

	public void area(int a) {
		System.out.println(a);
	}

	public void area(float a) {
		System.out.println(a);
	}
}

public class Overloading {

	public Overloading() {
		System.out.println("Constructor - param 0");
	}

	public Overloading(int a) {
		System.out.println("Constructor - param 1");
	}

	public Overloading(float a) {
		System.out.println("Constructor - param 2");
	}

	public Overloading(int a, float b) {
		System.out.println("Constructor - param 0");
	}

	public static void main(String[] args) {
		Topclass a = new Topclass();

		a.area();
		a.area(5);
		a.area((float) 5.0);
		a.area(5.6f);

		Overloading o = new Overloading();
		Overloading p = new Overloading(5);
		Overloading q = new Overloading(5.5f);
		Overloading r = new Overloading(5, 6);

	}

}
