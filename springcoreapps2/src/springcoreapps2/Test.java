package springcoreapps2;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Resource res=new ClassPathResource("Springconfig.xml");
		//BeanFactory factory=new XmlBeanFactory(res);
		ApplicationContext context=new ClassPathXmlApplicationContext("Springconfig.xml");
		//Emp emp=(Emp)factory.getBean("obj");
		Company c=(Company)context.getBean("obj2");
		//System.out.println(emp);
		System.out.println(c);
	}

}
