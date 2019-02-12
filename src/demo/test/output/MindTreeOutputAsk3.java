package demo.test.output;

public class MindTreeOutputAsk3 {

	
	public static void main(String[] args) {
		
		// Ask in mindtree interview
		int a[] = {0,1,5,5,5,2};
		
		int maximum=a[0];
		int maximize=0;
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i] > maximum)
			{
				maximum=a[i];
				maximize=i;
			}
		}
		
		System.out.println(maximize);
	}
}

//Output options - a) 0 b) 2 c) 1 d) 5