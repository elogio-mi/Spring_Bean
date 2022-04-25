package info.example.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.example.databeans.DataBean1;
import info.example.databeans.DataBean2;
import info.example.beans.MyBean1;
import info.example.beans.MyBean2;
import info.example.beans2.MyBean3;
import info.example.beans2.MyBean4;

import info.example.config.BeanConfigClass;
import info.example.config.BeanConfigClass2;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		
		MyBean1 xml1 = ctx1.getBean("xml1",MyBean1.class);
		System.out.printf("xml1: %s\n", xml1);
		
		MyBean1 xml2 = ctx1.getBean("xml2",MyBean1.class);
		System.out.printf("xml2: %s\n", xml2);
		
		MyBean2 xml = ctx1.getBean(MyBean2.class);
		System.out.printf("xml: %s\n", xml);
		
		
		ctx1.close();
			
		
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MyBean1 java1 = ctx2.getBean(MyBean1.class);
		System.out.printf("java1: %s\n", java1);
		
		MyBean2 java2 = ctx2.getBean(MyBean2.class);
		System.out.printf("java2: %s\n", java2);
		
		MyBean3 java3 = ctx2.getBean(MyBean3.class);
		System.out.printf("java3: %s\n", java3);
		ctx2.close();
		
		
		ClassPathXmlApplicationContext ctx3 = new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		
		
		
		MyBean3 comp1 = ctx3.getBean(MyBean3.class);
		System.out.printf("comp1: %s\n", comp1);
		
		MyBean4 comp2 = ctx3.getBean(MyBean4.class);
		System.out.printf("comp2: %s\n", comp2);
		
//		MyBean3 xcomp1 = ctx3.getBean("xcomp1",MyBean3.class);
//		System.out.printf("xcomp1: %s\n", xcomp1);
//		
//		MyBean4 xcomp2 = ctx3.getBean("xcomp2",MyBean4.class);
//		System.out.printf("xcomp2: %s\n", xcomp2);
		ctx3.close();
		
		
		AnnotationConfigApplicationContext ctx4 = new AnnotationConfigApplicationContext(BeanConfigClass2.class);
		
		MyBean3 jcomp1 = ctx4.getBean(MyBean3.class);
		System.out.printf("jcomp1: %s\n", jcomp1);
		
		MyBean4 jcomp2 = ctx4.getBean("bean4",MyBean4.class);
		System.out.printf("jcomp2: %s\n", jcomp2);
		
		MyBean4 jcomp3 = ctx4.getBean("java100",MyBean4.class);
		System.out.printf("java100: %s\n", jcomp3);
		
		MyBean4 jcomp4 = ctx4.getBean("java200",MyBean4.class);
		System.out.printf("java100: %s\n", jcomp4);
		
		
		ctx4.close();
		
		
	}
	
}
