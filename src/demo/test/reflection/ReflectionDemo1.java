package demo.test.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchFieldException
	{
		
		Test objTest = new Test();
		
		Class cls = objTest.getClass();
		System.out.println("Class name = " + cls.getName());
		
		Constructor constructor = cls.getConstructor();
        System.out.println("The name of constructor is " +
                            constructor.getName());
        
        System.out.println("The public methods of class are : ");
        
        // Getting methods of the class through the object
        // of the class by using getMethods
        Method[] methods = cls.getMethods();
 
        // Printing method names
        for (Method method:methods)
            System.out.println(method.getName());
        System.out.println("-------------------------");
        
        // creates object of desired method by providing the
        // method name and parameter class as arguments to
        // the getDeclaredMethod
        Method methodcall1 = cls.getDeclaredMethod("method2",
                                                 int.class);
 
        // invokes the method at runtime
        methodcall1.invoke(objTest, 19);
        
        System.out.println("-------------------------");
 
        // creates object of the desired field by providing
        // the name of field as argument to the 
        // getDeclaredField method
        Field field = cls.getDeclaredField("s");
 
        // allows the object to access the field irrespective
        // of the access specifier used with the field
        field.setAccessible(true);
 
        // takes object and the new value to be assigned
        // to the field as arguments
        field.set(objTest, "JAVA");
 
        // Creates object of desired method by providing the
        // method name as argument to the getDeclaredMethod
        Method methodcall2 = cls.getDeclaredMethod("method1");
 
        // invokes the method at runtime
        methodcall2.invoke(objTest);
 
        // Creates object of the desired method by providing
        // the name of method as argument to the 
        // getDeclaredMethod method
        Method methodcall3 = cls.getDeclaredMethod("method3");
 
        // allows the object to access the method irrespective 
        // of the access specifier used with the method
        methodcall3.setAccessible(true);
 
        // invokes the method at runtime
        methodcall3.invoke(objTest);
 
	}
}
