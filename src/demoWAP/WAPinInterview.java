package demoWAP;

import java.util.HashMap;

public class WAPinInterview {

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,1,9,2,11,19,7};
		
		//secondMinMax(arr);
		duplicateElementInString();
		
	}

	private static void duplicateElementInString() {
		
		String str = "hellow world";
		HashMap<Character, Integer> hm = new HashMap();
		char[] strArray = str.toCharArray();
		
		for (char c : strArray)
		{
			if (hm.containsKey(c))
			{
				hm.put(c,hm.get(c) + 1);
			}
			else
				hm.put(c, 1);
		}
		
		System.out.println("hm = " + hm);
		
	}

	/*Cognigent - WAP to find the second max and second min of array*/
	private static void secondMinMax(int[] a) {
		
		int min1,min2,max1,max2,i;
		
		if(a[0] > a[1])
		{
			max1 = min2 = a[0];
			max2 = min1 = a[1];
		}
		else
		{
			max1 = min2 = a[1];
			max2 = min1 = a[0];
		}
		
		for(i=2;i<a.length;i++)
		{
			if(max2 <= a[i])
			{
				if(max1 <= a[i])
				{
					max2=max1;
					max1=a[i];
				}
				else
				max2=a[i];
			}
			if(min2 >= a[i])
			{
				if(min1 >= a[i])
				{
					min2 = min1;
					min1 = a[i];
				}
				else
				min2=a[i];
			}
		}
		
		System.out.println("Array = " + a.toString());
		System.out.println("min1 = " + min1);
		System.out.println("min2 = " + min2);
		System.out.println("max1 = " + max1);
		System.out.println("max2 = " + max2);
		
	}
}
