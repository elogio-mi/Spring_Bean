package info.example.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.example.beans.DataBean1;
import info.example.beans.MyBean1;
import info.example.beans.MyBean2;
import info.example.beans.MyBean3;
import info.example.config.BeanConfigClass;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이어서 작성하기.
		
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		System.out.println("-----------------------------");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
	
		MyBean1 xml1 = ctx1.getBean("xml1", MyBean1.class);
		System.out.printf("xml1.data1 : %d\n", xml1.getData1());
		System.out.printf("xml1.data2 : %s\n", xml1.getData2());
		System.out.printf("xml1.data3 : %s\n", xml1.getData3());
		
		MyBean1 xml2 = ctx1.getBean("xml2", MyBean1.class);
		System.out.printf("xml2.data1 : %d\n", xml2.getData1());
		System.out.printf("xml2.data2 : %s\n", xml2.getData2());
		System.out.printf("xml2.data3 : %s\n", xml2.getData3());
		System.out.println("-----------------------------");
		
		
		
		MyBean1 java1 = ctx2.getBean("java1", MyBean1.class);
		System.out.printf("java1.data1 : %d\n", java1.getData1());
		System.out.printf("java1.data2 : %s\n", java1.getData2());
		System.out.printf("java1.data3 : %s\n", java1.getData3());
		
		System.out.println("-----------------------------");
		
		
		MyBean1 java2 = ctx2.getBean("java2", MyBean1.class);
		System.out.printf("java2.data1 : %d\n", java2.getData1());
		System.out.printf("java2.data2 : %s\n", java2.getData2());
		System.out.printf("java2.data3 : %s\n", java2.getData3());
		System.out.println("----------------------------"); 
		
		MyBean2 xml3 = ctx1.getBean("xml3", MyBean2.class);
		System.out.printf("xml3.data1 : %s\n", xml3.getData1());
		System.out.printf("xml3.data2 : %s\n", xml3.getData2());		
		System.out.println("----------------------------");
		
		MyBean3 xml4 = ctx1.getBean("xml4", MyBean3.class);
		System.out.printf("xml4.data1 : %s\n", xml4.getData1());
		System.out.printf("xml4.data2 : %s\n", xml4.getData2());		
		System.out.println("----------------------------");
		
		
		MyBean2 java3 = ctx2.getBean("java3", MyBean2.class);
		System.out.printf("java3.data1 : %s\n", java3.getData1());
		System.out.printf("java3.data2 : %s\n", java3.getData2());
		System.out.println("----------------------------");
		
		MyBean3 java4 = ctx2.getBean("java4", MyBean3.class);
		System.out.printf("java4.data1 : %s\n", java4.getData1());
		System.out.printf("java4.data2 : %s\n", java4.getData2());
		System.out.println("----------------------------");
		ctx1.close();
		ctx2.close();
	}

}
