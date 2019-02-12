package demo.test.threads;

public class MultithreadingWithThread extends Thread{
	
	int c=0;
	
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("Thread: " + Thread.currentThread().getId() + " , c = " + ++c);
		}
	}
	
	public static void main(String[] args)
	{
		MultithreadingWithThread mt1 = new MultithreadingWithThread();
		MultithreadingWithThread mt2 = new MultithreadingWithThread();
		MultithreadingWithThread mt3 = new MultithreadingWithThread();
		MultithreadingWithThread mt4 = new MultithreadingWithThread();
		
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();	
	}

}
