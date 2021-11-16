  package annotations;

import java.lang.annotation.*;
//
//
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute
  {
	int Sequence()default 0;
  }

public class quest2
{
	public int num;
	
	public quest2(int num) {
		this.num=num;
	}
	
	@Execute()
	public static void method1()
	{
		System.out.println("this is m1");
	}
	
	@Execute()
	public static void method2()
	{
		System.out.println("this is m2");
	}
}




