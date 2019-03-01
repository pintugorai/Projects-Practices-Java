package demo.test.threads.returnValueFromTask;

public interface ResultListener<T> {

	void notifyresult(T result);
}
