package demo.test.threads.executorDemo;

import java.util.concurrent.TimeUnit;

public class LoopTask implements Runnable {
	
	private static int count =0;
	private int id;

	@Override
	public void run() {
		System.out.println("<TASK-" + id + "> Starting ##############");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("<" + id + "> Test - " + i);

			try {
				TimeUnit.MICROSECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("<TASK-" + id + "> Done **************");
	}
	
	public LoopTask()
	{
		this.id= ++count;
	}

}
