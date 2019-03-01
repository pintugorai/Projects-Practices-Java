package demo.test.threads.namingThread;

public class NamingThread1 {
	public static void main(String[] args) {
		System.out.println("Main thread start here .....");
		
		new Thread(new LoopTaskB()).start();
		
		Thread t = new Thread(new LoopTaskB());
		t.start();
		
		System.out.println("Main thread end here ......");
	}
}
