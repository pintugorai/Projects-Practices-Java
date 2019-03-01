package demo.test.threads.returnValueFromTask;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.eclipse.jetty.util.CompletableCallback;

import demo.test.threads.executorDemo.LoopTask;
import demo.test.threads.namingThread.NamedThreadFactory;

public class ReturningValueUsingExecutorsSecondWay {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main Thread Starts Here..........");

		ExecutorService e = Executors.newCachedThreadPool(new NamedThreadFactory());
		
		CompletionService<Integer> task = new ExecutorCompletionService<Integer>(e);

		task.submit(new CalculationTaskA(4, 5, 200));
		task.submit(new CalculationTaskA(5, 6, 500));
		task.submit(new CalculationTaskA(10, 20, 2000));
		//Future<?> result4 = e.submit(new LoopTask());
		task.submit(new LoopTask(), 123);

		e.shutdown();
		for (int i=0;i<4;i++)
		{
			try {
				System.out.println("task-" + i + " = " + task.take().get());
			} catch (InterruptedException | ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		System.out.println("[" + currentThreadName + "] Main Thread Ends Here..........");
	}
}
