package cheng;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain
{

	public static void main(String[] args)
	{
		
		
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
//		System.out.println(ctx.getMessage("hi",null,Locale.getDefault(Category.FORMAT)));
//		System.out.println(ctx.getMessage("wel", new String[] {"ËïÎò¿Õ"},
//		Locale.getDefault(Category.FORMAT)));
		
		Dog dg = (Dog)ctx.getBean("pet");
	    dg.bark();
	}

}
