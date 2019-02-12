package interview.java200qn;

class ABC
{
	
	private void show()
	{
		System.out.println("Show ABC");
	}
}

public class ObjectsDemo extends ABC{
	
	String name;
	ObjectsDemo(String n)
	{
		name = n;
	}
	
	public void show()
	{
		System.out.println("Show ObjectsDemo");
	}
	
	@Override
	public String toString() {
		return "ObjectsDemo [name=" + name + "]";
	}

	public static void main(String[] args) {
		
		String s= "Pintu Gorai";
		System.out.println(" a" + s.toString());
		System.out.println(s.hashCode());
		//System.out.println(s.clone());
		
		ObjectsDemo obj = new ObjectsDemo("P Gorai");
		
		System.out.println(obj);
		
		obj.show();
		
	}

}
