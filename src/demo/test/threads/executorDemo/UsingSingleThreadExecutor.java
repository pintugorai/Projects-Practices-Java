package demo.test.threads.executorDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingSingleThreadExecutor {
	
	public static void main(String[] args) {
		
		// It uses where a serially access to a common resource.
		ExecutorService e = Executors.newSingleThreadExecutor(); // special case of FixedThread executor, it will execute one thread at a time. But it has some special property.
		
		
		e.execute(new LoopTask());
		e.execute(new LoopTask());
		e.execute(new LoopTask());
		
		e.shutdown(); // if you miss, it will be memory leak
		
		//e.execute(new LoopTask()); // it will not accepted, as the service shout down already.
		
	}

}
