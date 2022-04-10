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
		
		MyBean1 xml1 = ctx1.getBean("xml1",MyBean1.class);
		System.out.printf("xml1.data1 : %d\n", xml1.getData1());
		System.out.printf("xml1.data2 : %s\n", xml1.getData2());
		System.out.printf("xml1.data3 : %s\n", xml1.getData3());
		System.out.printf("xml1.data4 : %s\n", xml1.getData4());
		System.out.printf("xml1.data5 : %s\n", xml1.getData5());
		System.out.printf("xml1.data6 : %s\n", xml1.getData6());
		
		MyBean2 xml2 = ctx1.getBean("xml2",MyBean2.class);
		System.out.printf("xml2.data1 : %d\n", xml2.getData1());
		System.out.printf("xml2.data2 : %s\n", xml2.getData2());
		System.out.printf("xml2.data3 : %s\n", xml2.getData3());
		System.out.printf("xml2.data4 : %s\n", xml2.getData4());
		
		ctx1.close();
		System.out.println("-----------------------------");
		
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MyBean1 java1 = ctx2.getBean("java1",MyBean1.class);
		System.out.printf("java1.data1 : %d\n", java1.getData1());
		System.out.printf("java1.data2 : %s\n", java1.getData2());
		System.out.printf("java1.data3 : %s\n", java1.getData3());
		System.out.printf("java1.data4 : %s\n", java1.getData4());
		System.out.printf("java1.data5 : %s\n", java1.getData5());
		System.out.printf("java1.data6 : %s\n", java1.getData6());
		
		MyBean2 java2 = ctx2.getBean("java2",MyBean2.class);
		System.out.printf("java2.data1 : %d\n", java2.getData1());
		System.out.printf("java2.data2 : %s\n", java2.getData2());
		System.out.printf("java2.data3 : %s\n", java2.getData3());
		System.out.printf("java2.data4 : %s\n", java2.getData4());
		
		
		ctx2.close();
		System.out.println("-----------------------------");
		
	}

}
