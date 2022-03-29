package info.example.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import info.example.beans.MyBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2();
	}
	public static void test1() {
		ClassPathResource res = 
				new ClassPathResource("info/example/config/beans.xml");
		XmlBeanFactory factory = 
				new XmlBeanFactory(res);
		
		MyBean1 b1 = factory.getBean("t1", MyBean1.class);
		System.out.println("b1객체정보(주소값): " + b1);
		//MyBean2 t1 = factory.getBean("t1", MyBean.class);
		//System.out.println("t2객체정보: " + b2);
	}
	
	public static void test2() {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		
		MyBean1 b1 = ctx.getBean("t1", MyBean1.class);
		System.out.println("b1객체정보(주소값): " + b1);
		MyBean1 b2 = ctx.getBean("t1", MyBean1.class);
		System.out.println("b2객체정보: " + b2);
		
		ctx.close();
	}
}
