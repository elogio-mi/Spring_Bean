package info.example.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.example.beans.DataBean1;
import info.example.beans.MyBean1;

import info.example.config.BeanConfigClass;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		System.out.println("-----------------------------");
		
		AnnotationConfigApplicationContext ctx2 = 
				new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
	
		MyBean1 xml1 = ctx1.getBean("xml1", MyBean1.class);
		System.out.printf("xml1.data1 : %s\n", xml1);
		System.out.println("-----------------------------");
		
		ctx1.close();
		
		MyBean1 java1 = ctx2.getBean("java1", MyBean1.class);
		System.out.printf("java1.data1 : %s\n", java1);
		
		System.out.println("-----------------------------");
		
		
		MyBean1 java12 = ctx2.getBean("java12", MyBean1.class);
		System.out.printf("java12.data1 : %s\n", java12);
		
		System.out.println("----------------------------"); 
		
		ctx2.close();
	}

}
