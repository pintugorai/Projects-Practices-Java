package demo.test.SaturdaySunday;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		
		arraylist.add("This");
		arraylist.add("is");
		arraylist.add("arraylist");
		
		System.out.println(arraylist.get(0));
		
		for(String s : arraylist)
		{
			System.out.println( s);
		}
		
		
	}
}
