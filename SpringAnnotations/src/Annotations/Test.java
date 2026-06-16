package Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context=new ClassPathXmlApplicationContext("SpringAnnotationsConfig.xml");
	College clg=(College)context.getBean(College.class);
	System.out.println(clg);

	}

}
