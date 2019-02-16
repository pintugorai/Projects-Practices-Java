package demo.test.threads;

import java.util.concurrent.TimeUnit;

//Calling thread from constructor

public class ThreadExample3 {

	public static void main(String[] args) {

		System.out.println("Main thread starts here ......");

		new ExamoleThread1();
		Thread t = new ExamoleThread1();

		System.out.println("Main thread ends here ......");
	}

}

class ExamoleThread1 extends Thread {
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

	public ExamoleThread1() {
		this.id = ++count;
		this.start();
	}
}
