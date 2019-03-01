package demo.test.threads.namingThread;

import java.util.concurrent.TimeUnit;

public class NamingThread2 {
	public static void main(String[] args) {
		System.out.println("Main thread start here .....");
		
		new Thread(new LoopTaskC(),"Print-Number-Thread-One").start();
		
		Thread t = new Thread(new LoopTaskC());
		//t.setName("Print-Number-Thread-Two"); // set name before thread start.
		t.start();
		
		try {
			TimeUnit.MICROSECONDS.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// set name during running the thread.		
		t.setName("Print-Number-Thread-Two");
		
		
		System.out.println("Main thread end here ......");
	}
}
