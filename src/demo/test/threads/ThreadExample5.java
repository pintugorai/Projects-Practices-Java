package demo.test.threads;

import java.util.concurrent.TimeUnit;

//Calling thread from constructor

public class ThreadExample5 {

	public static void main(String[] args) {

		System.out.println("Main thread starts here ......");

		new TaskThree();
		new TaskThree();

		System.out.println("Main thread ends here ......");
	}

}

class TaskThree implements Runnable {
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

	public TaskThree() {
		this.id = ++count;
		new Thread(this).start();
	}
}
