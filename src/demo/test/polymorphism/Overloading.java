package demo.test.polymorphism;

//Method overloading, compile time polymorphism, early binding
/*
 * Three ways to overload a method

In order to overload a method, the argument lists of the methods must differ in either of these:
1. Number of parameters.
For example: This is a valid case of overloading

add(int, int)
add(int, int, int)

2. Data type of parameters.
For example:

add(int, int)
add(int, float)

3. Sequence of Data type of parameters.
For example:

add(int, float)
add(float, int)

Invalid case of method overloading:
When I say argument list, I am not talking about return type of the method, 
for example if two methods have same name, same parameters and have different return type, 
then this is not a valid method overloading example. This will throw compilation error.

int add(int, int)
float add(int, int)
 * 
 * 

*/
class CalculateArea
{
	public void area()
	{
		System.out.println("1. Area method");
	}
	
	public void area(int r)
	{
		System.out.println("2. Area = " + 2*(22/7)*r);
	}
	
	public int area(float r)
	{
		int re = 2 * (22/7) * (int) r;
		return(re);
	}
}
public class Overloading {
	
	public static void main(String[] args) {
		CalculateArea ca=new CalculateArea();
		
		ca.area();
		ca.area(10);
		int r = ca.area(10.0f);
		System.out.println("area = " + r);
	}

}
