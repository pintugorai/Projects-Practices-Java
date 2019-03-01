package demo.test.threads.returnValueFromTask;

public class ReturnValueSecondWay {

	// Values return from task. Thread does not return value.

	public static void main(String[] args) {
		System.out.println("Main thread start here .....");

		ReturningValueTaskB task1 = new ReturningValueTaskB(2, 3, 5000, new SumObserver("task-1"));
		Thread t1 = new Thread(task1, "MyThread-1");
		
		ReturningValueTaskB task2 = new ReturningValueTaskB(4, 4, 3000,new SumObserver("task-2"));
		Thread t2 = new Thread(task2, "MyThread-2");
		
		ReturningValueTaskB task3 = new ReturningValueTaskB(5,6, 1000,new SumObserver("task-3"));
		Thread t3 = new Thread(task3, "MyThread-3");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		System.out.println("Main thread end here ......");
	}

}
