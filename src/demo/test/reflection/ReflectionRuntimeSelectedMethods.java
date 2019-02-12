package demo.test.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class ReflectionRuntimeSelectedMethods {
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException {
		
		ArrayList<String> methods = new ArrayList<String>();
		
		methods.add("method1");
		methods.add("method11");
		
		String className="demo.test.reflection.Test";
		
		
		Iterator<String> i = methods.iterator();
		
		while(i.hasNext())
		{
			String methodName = i.next();
			Class c=Class.forName(className); 
			
			Method methodcall1 = c.getDeclaredMethod(methodName);
			methodcall1.invoke(c.newInstance());
			
		}
	}
	
}
