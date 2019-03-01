package demo.test.threads.namingThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NamingThreadExecutor3 {
	public static void main(String[] args) {
		System.out.println("Main thread start here .....");
		
		ExecutorService e = Executors.newCachedThreadPool();
		
		// default naming format is "pool-N-thread-M". here N and M start from 1 not from 0 e.g.- pool-1-thread-1
		e.execute(new LoopTaskC());
		e.execute(new LoopTaskC());
		e.execute(new LoopTaskC());
		
		e.shutdown();
		
		System.out.println("Main thread end here ......");
	}
}
