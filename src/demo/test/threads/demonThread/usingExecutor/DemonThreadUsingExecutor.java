package demo.test.threads.demonThread.usingExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import demo.test.threads.demonThread.LoopTaskDemon;

public class DemonThreadUsingExecutor {

public static void main(String[] args) {
		
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("[" + currentThreadName + "]####### Main thread Started");
		
		ExecutorService e = Executors.newCachedThreadPool(new DemonThreadFacroty());
		
		e.execute(new LoopTaskDemon(100));
		e.execute(new LoopTaskDemon(200));
		e.execute(new LoopTaskDemon(100));
		e.execute(new LoopTaskDemon(400));
		e.execute(new LoopTaskDemon(200));
		
		e.shutdown();
		
		System.out.println("[" + currentThreadName + "]####### Main thread Done");
		
		
		
	}
}
