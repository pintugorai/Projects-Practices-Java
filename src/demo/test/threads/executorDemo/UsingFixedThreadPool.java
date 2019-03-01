package demo.test.threads.executorDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingFixedThreadPool {
	
	public static void main(String[] args) {
		
		ExecutorService e = Executors.newFixedThreadPool(3);
		
		e.execute(new LoopTask());
		e.execute(new LoopTask());
		e.execute(new LoopTask());
		e.execute(new LoopTask());
		e.execute(new LoopTask());
		e.execute(new LoopTask());
		
		e.shutdown(); // if you miss, it will be memory leak
		
		//e.execute(new LoopTask()); // it will not accepted, as the service shout down already.
		//Exception in thread "main" java.util.concurrent.RejectedExecutionException: Task demo.test.threads.executorDemo.LoopTask@55f96302 rejected from java.util.concurrent.ThreadPoolExecutor@3d4eac69[Shutting down, pool size = 3, active threads = 3, queued tasks = 3, completed tasks = 0]

	}

}
