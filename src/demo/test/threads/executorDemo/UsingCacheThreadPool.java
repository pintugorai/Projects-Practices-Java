package demo.test.threads.executorDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingCacheThreadPool {
	
	public static void main(String[] args) {
		
		ExecutorService e = Executors.newCachedThreadPool(); // no upper limit in the thread pool
		
		e.execute(new LoopTask());
		e.execute(new LoopTask());
		e.execute(new LoopTask());
		e.execute(new LoopTask());
		e.execute(new LoopTask());
		e.execute(new LoopTask());
		
		e.shutdown(); // if you miss, it will be memory leak
		
		//e.execute(new LoopTask()); // it will not accepted, as the service shout down already.
		
	}

}
