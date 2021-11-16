package annotations;


public class quest1 {
	@interface Test
	{
		int testcase();
		
	}
	
	@Test(testcase=1)
	public static void method1()
	{
		System.out.println("method1 created");
	}
	
	@Test(testcase=2)
	public static void method2()
	{
		System.out.println("method2 created");
	}
	public static void main(String args[])
	{
		method1();
		method2();
	}
}
	
