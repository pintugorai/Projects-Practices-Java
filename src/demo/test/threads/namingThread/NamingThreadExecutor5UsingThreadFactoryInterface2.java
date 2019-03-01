package demo.test.threads.namingThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class NamingThreadExecutor5UsingThreadFactoryInterface2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread start here .....");
		
		ExecutorService e = Executors.newCachedThreadPool(new NamedThreadFactory());
		
		// default naming format is "pool-N-thread-M". here N and M start from 1 not from 0 e.g.- pool-1-thread-1
		e.execute(new LoopTaskC()); //Task-1
		e.execute(new LoopTaskC()); //Task-2
		e.execute(new LoopTaskC()); //Task-3
		
		TimeUnit.SECONDS.sleep(15); // in this duration above three task will be completed by, first three threads.
		
		// Here first three thread will be reused for task-4,5,6. and two new thread will be created.
		// Analysis the output.
		e.execute(new LoopTaskC()); //Task-4
		e.execute(new LoopTaskC()); //Task-5
		e.execute(new LoopTaskC()); //Task-6
		e.execute(new LoopTaskC()); //Task-7
		e.execute(new LoopTaskC()); //Task-8
		
		e.shutdown();
		
		System.out.println("Main thread end here ......");
	}
}
