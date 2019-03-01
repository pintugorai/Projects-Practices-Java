package demo.test.threads.returnValueFromTask;

import java.util.concurrent.TimeUnit;

public class ReturningValueTaskA implements Runnable {

	private int a;
	private int b;
	private int sum;
	private long sleepTime;

	private static int count = 0;
	private static int instanceNumber;
	private static String taskId;
	
	private volatile boolean done = false;

	public ReturningValueTaskA(int a, int b, int sleepTime) {
		this.a = a;
		this.b = b;
		this.sleepTime = sleepTime;

		this.instanceNumber = ++count;
		this.taskId = "ReturningValueTaskA" + instanceNumber;
	}

	@Override
	public void run() {
		String currentThreadName = Thread.currentThread().getName();

		System.out.println("###########[" + currentThreadName + "] <" + taskId + "> ###### Starting ......");
		System.out.println(
				"###########[" + currentThreadName + "] <" + taskId + "> Sleeping for " + sleepTime + "millis");

		try {
			TimeUnit.MICROSECONDS.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		sum = a+b;

		System.out.println("*********[" + currentThreadName + "] <" + taskId + "> ********** Done ......");
		
		done = true;
		
		synchronized(this)
		{
			System.out.println("[" + Thread.currentThread().getName() + "] is NOTIFYING ...");
			this.notifyAll();
		}
	}
	
	public int getSum()
	{
		if (!done)
		{
			synchronized (this) {
				try {
					System.out.println("[" + Thread.currentThread().getName() + "] is waiting for <" + taskId +">");
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
				System.out.println("[" + Thread.currentThread().getName() + "] is WOKEN-UP ....");
			}
		}
		return this.sum;
	}

}
