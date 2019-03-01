package demo.test.threads.demonThread;

import java.util.concurrent.TimeUnit;

public class LoopTaskDemon implements Runnable {

	private static int count =0;
	private int instanceNumber;
	private String taskId;
	
	private long sleepTime;
	@Override
	public void run() {
		boolean isRunningInDemonThread = Thread.currentThread().isDaemon();
		String threadType = isRunningInDemonThread? "DEMON" : "USER";
		
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("###########["+ currentThreadName + "]-" + threadType +"<" + taskId + "> is Starting #########");
		
		for(int i=0;i<5;i++)
		{
			System.out.println("<" + taskId + ">" + i);
			
			try {
				TimeUnit.MICROSECONDS.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		}
		
		System.out.println("***********["+ currentThreadName + "]-" + threadType +"<" + taskId + "> is Done *************");
	}

	public LoopTaskDemon(long sleepTime) {
		this.sleepTime= sleepTime;
		this.instanceNumber = ++count;
		this.taskId = "LoopTaskDemon-" + instanceNumber;
	}
}
