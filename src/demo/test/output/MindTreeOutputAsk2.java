package demo.test.output;

public class MindTreeOutputAsk2 {

	
	public static void main(String[] args) {
		
		// Ask in mindtree interview
		int a[] = {0,1,2,3,4,5};
		try {
		for(int i=0;i<7;i++)
		{
			System.out.print(a[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("o");
		}
	}
}
