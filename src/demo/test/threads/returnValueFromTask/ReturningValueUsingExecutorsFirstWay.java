package demo.test.threads.returnValueFromTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import demo.test.threads.executorDemo.LoopTask;
import demo.test.threads.namingThread.NamedThreadFactory;

public class ReturningValueUsingExecutorsFirstWay {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main Thread Starts Here..........");

		ExecutorService e = Executors.newCachedThreadPool(new NamedThreadFactory());

		Future<Integer> result1 = e.submit(new CalculationTaskA(4, 5, 200));
		Future<Integer> result2 = e.submit(new CalculationTaskA(5, 6, 500));
		Future<Integer> result3 = e.submit(new CalculationTaskA(10, 20, 2000));
		Future<?> result4 = e.submit(new LoopTask());
		Future<Double> result5 = e.submit(new LoopTask(), 123.456);

		e.shutdown();
		try {
			System.out.println("result1 = " + result1.get());
			System.out.println("result1 = " + result2.get());
			System.out.println("result1 = " + result3.get());
			System.out.println("result4 = " + result4.get());
			System.out.println("result5 = " + result5.get());
		} catch (InterruptedException | ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("[" + currentThreadName + "] Main Thread Ends Here..........");
	}
}
