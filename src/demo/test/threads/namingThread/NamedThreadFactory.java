package demo.test.threads.namingThread;

import java.util.concurrent.ThreadFactory;

public class NamedThreadFactory implements ThreadFactory {

	private static int count =0;
	private static String NAME = "Mythread-";
	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r,NAME + ++count);
		return t;
	}

}
