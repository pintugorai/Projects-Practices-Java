package demo.test.threads.demonThread.usingExecutor;

import demo.test.threads.namingThread.NamedThreadFactory;

public class DemonThreadFacroty extends NamedThreadFactory{

	private static int count =0;
	@Override
	public Thread newThread(Runnable r) {
		Thread t = super.newThread(r);
		
		count++;
		
		if(count % 2 ==0)
		{
			t.setDaemon(true);
		}
		
		return t;
	}
}
