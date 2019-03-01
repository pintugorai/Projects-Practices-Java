package demo.test.threads.returnValueFromTask;

public class SumObserver implements ResultListener<Integer> {

	private String taskId;

	public SumObserver(String taskId) {
		this.taskId = taskId;
	}

	@Override
	public void notifyresult(Integer result) {
		System.out.println("Result for " + taskId + " = " + result);
	}

}
