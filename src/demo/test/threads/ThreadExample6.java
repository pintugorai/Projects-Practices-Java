package demo.test.threads;

import java.util.concurrent.TimeUnit;

//Calling thread from constructor

public class ThreadExample6 {

	public static void main(String[] args) {

		System.out.println("Main thread starts here ......");

		new Thread(new TaskFour()).start();
		Thread t = new Thread(new TaskFour());
		
		t.start();

		System.out.println("Main thread ends here ......");
	}

}

class TaskFour implements Runnable {
	private static int count =0;
	private int id;

	
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("<" + id + "> Test - " + i);

			try {
				TimeUnit.MICROSECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public TaskFour() {
		this.id = ++count;
		//new Thread(this).start();
	}
}
