package Collections;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Springcoll.xml");
//		Student st=(Student)context.getBean("std");
//		Set<Integer> ids=st.getIds();
//		for(Integer i:ids)
//		{
//			System.out.println(i);
//		}
//		List<String> names=st.getNames();
//		for(String n:names)
//		{
//			System.out.println(n);
//		}
//		List<Double> marks=st.getMarks();
//		for(Double m:marks)
//		{
//			System.out.println(m);
//		}
		Product values=(Product)context.getBean("map");
		Map<Integer,String> mp=values.getProductvalues();
		System.out.println(mp.entrySet());
	}

}
