package demo.test.threads;

public class UsingRunnable implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Thread " + Thread.currentThread().getId() + " ,i = " + i);
		}

	}
	
	public static void main(String[] args)
	{
		UsingRunnable mt1 = new UsingRunnable();
		UsingRunnable mt2 = new UsingRunnable();
		UsingRunnable mt3 = new UsingRunnable();
		UsingRunnable mt4 = new UsingRunnable();
		
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		Thread t3 = new Thread(mt3);
		Thread t4 = new Thread(mt4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();	
	}

}
