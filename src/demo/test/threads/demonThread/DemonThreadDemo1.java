package demo.test.threads.demonThread;

public class DemonThreadDemo1 {

	public static void main(String[] args) {
		
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("[" + currentThreadName + "]####### Main thread Started");
		
		Thread t1 = new Thread(new LoopTaskDemon(500), "Thread-1");
		Thread t2 = new Thread(new LoopTaskDemon(1000), "Thread-2");
		
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
		System.out.println("[" + currentThreadName + "]####### Main thread Done");
		
		
		
	}

}
