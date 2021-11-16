package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
 @interface info{
	int authorId();
	String authorName()default "raj";
	String supervisor()default "onkar";
	String date();
	String time();
	int version();
	String description();
	
	
}
public class quest3 {
public static void main(String args[])
{
	quest3 d=new quest3();
	Class c=d.getClass();
	java.lang.annotation.Annotation a=c.getAnnotation(info.class);
	info i=(info)a;
	System.out.println(i.authorName());
	System.out.println(i.supervisor());
//	System.out.println(i.time());
//	System.out.println(i.version());
	
}


}
