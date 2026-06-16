package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Resource res=new ClassPathResource("Springconfig.xml");
		//BeanFactory factory=new XmlBeanFactory(res);
		ApplicationContext context=new ClassPathXmlApplicationContext("Springconfig.xml");
		Product prod=(Product)context.getBean("obj");
		//System.out.println(prod.getPid()+" "+prod.getPname()+" "+prod.getPrice());
		System.out.println(prod);
	}

}
