package demo.test.threads;

import java.util.concurrent.TimeUnit;

//Calling thread from constructor

public class ThreadExample7 {

	public static void main(String[] args) {

		System.out.println("Main thread starts here ......");


		//inline function
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(" Test - " + i);

					try {
						TimeUnit.MICROSECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		t.start();

		System.out.println("Main thread ends here ......");
	}

}
