package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.METHOD)
//@Retention(RetentionPolicy.RUNTIME)
//@interface Execute
//  {
//	int Sequence()default 0;
//  }

public class quest2Test {
	public static void main(String args[]) {
		
		quest2 t=new quest2(34);
		Class c=t.getClass();
		Annotation a=(Annotation) c.getAnnotation(Execute.class);
		Execute e1=(Execute)a;
		System.out.println(e1.Sequence());
}
}
