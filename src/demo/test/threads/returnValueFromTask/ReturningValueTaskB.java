package demo.test.threads.returnValueFromTask;

import java.util.concurrent.TimeUnit;

public class ReturningValueTaskB implements Runnable {

	private int a;
	private int b;
	private int sum;
	private long sleepTime;

	private static int count = 0;
	private static int instanceNumber;
	private static String taskId;
	private ResultListener<Integer> listner;
	
	
	public ReturningValueTaskB(int a, int b, int sleepTime, ResultListener<Integer> result) {
		this.a = a;
		this.b = b;
		this.sleepTime = sleepTime;
		this.listner = result;

		this.instanceNumber = ++count;
		this.taskId = "ReturningValueTaskB" + instanceNumber;
	}

	@Override
	public void run() {
		String currentThreadName = Thread.currentThread().getName();

		System.out.println("###########[" + currentThreadName + "] <" + taskId + "> ###### Starting ......");
		System.out.println("###########[" + currentThreadName + "] <" + taskId + "> Sleeping for " + sleepTime + "millis");

		try {
			TimeUnit.MICROSECONDS.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		sum = a+b;

		System.out.println("*********[" + currentThreadName + "] <" + taskId + "> ********** Done ......");
		
		listner.notifyresult(sum);
	}
	
}
