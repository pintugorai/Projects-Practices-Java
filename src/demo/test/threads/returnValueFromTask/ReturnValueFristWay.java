package demo.test.threads.returnValueFromTask;

public class ReturnValueFristWay {

	// Values return from task. Thread does not return value.

	public static void main(String[] args) {
		System.out.println("Main thread start here .....");

		ReturningValueTaskA task1 = new ReturningValueTaskA(2, 3, 5000);
		Thread t1 = new Thread(task1, "MyThread-1");
		
		ReturningValueTaskA task2 = new ReturningValueTaskA(4, 4, 3000);
		Thread t2 = new Thread(task2, "MyThread-2");
		
		ReturningValueTaskA task3 = new ReturningValueTaskA(5,6, 1000);
		Thread t3 = new Thread(task3, "MyThread-3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Result of Task1 = " + task1.getSum());
		System.out.println("Result of Task2 = " + task2.getSum());
		System.out.println("Result of Task3 = " + task3.getSum());
		
		System.out.println("Main thread end here ......");
	}

}
