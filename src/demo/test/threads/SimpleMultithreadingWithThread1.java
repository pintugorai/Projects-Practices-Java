package demo.test.threads;

public class SimpleMultithreadingWithThread1 extends Thread{
	
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
		SimpleMultithreadingWithThread1 mt1 = new SimpleMultithreadingWithThread1();
		SimpleMultithreadingWithThread1 mt2 = new SimpleMultithreadingWithThread1();
		SimpleMultithreadingWithThread1 mt3 = new SimpleMultithreadingWithThread1();
		SimpleMultithreadingWithThread1 mt4 = new SimpleMultithreadingWithThread1();
		
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();	
	}

}
