package demo.test.threads.namingThread;

import java.util.concurrent.TimeUnit;

public class LoopTaskC implements Runnable {
	
	private static int count =0;
	private int instanceNumber;
	private String taskId;

	@Override
	public void run() {
		// name of all thread is same, in this case. if no such requirement, do not use it.
		//Thread.currentThread().setName("Print-Number-Thread-" + instanceNumber);
		
		//String currentThreadName = Thread.currentThread().getName();
			
		/*System.out.println("###### [ " + currentThreadName + "] <" + taskId + "> Starting ##############");*/
		System.out.println("###### [ " + Thread.currentThread().getName() + "] <" + taskId + "> Starting ##############");
		
		for (int i = 0; i < 10; i++) {
			/*System.out.println("[ " + currentThreadName + "] <" + taskId + "> Test - " + i);*/
			System.out.println("[ " + Thread.currentThread().getName() + "] <" + taskId + "> Test - " + i);

			try {
				TimeUnit.MICROSECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/*System.out.println("***** [ " + currentThreadName + "] <" + taskId + "> Done **************");*/
		System.out.println("***** [ " + Thread.currentThread().getName() + "] <" + taskId + "> Done **************");
	}
	
	LoopTaskC()
	{
		this.instanceNumber= ++count;
		this.taskId="LookTaskC-" + instanceNumber;
	}

}
