package info.example.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.example.beans.DataBean1;
import info.example.beans.MyBean1;
import info.example.beans.MyBean2;
import info.example.beans.MyBean3;
import info.example.beans.MyBean4;
import info.example.beans.MyBean5;
import info.example.beans.MyBean6;
import info.example.config.BeanConfigClass;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MyBean1 obj1 = ctx.getBean("obj1", MyBean1.class);
		MyBean2 obj2 = ctx.getBean("obj2", MyBean2.class);
		System.out.println("----------------------------------");
		
		
		
		MyBean3 obj3 = ctx.getBean("obj3", MyBean3.class);
		System.out.printf("obj3.data1: %s\n", obj3.getData1());
		System.out.printf("obj3.data2: %s\n", obj3.getData2());
		
		System.out.println("----------------------------------");
		
		MyBean4 obj4 = ctx.getBean("obj4", MyBean4.class);
		System.out.printf("obj4.data1: %s\n", obj4.getData1());
		System.out.printf("obj4.data2: %s\n", obj4.getData2());
		
		System.out.println("----------------------------------");
		
		MyBean5 obj5 = ctx.getBean("obj5", MyBean5.class);
		System.out.printf("obj5.data1: %s\n", obj5.getData1());
		System.out.printf("obj5.data2: %s\n", obj5.getData2());
		
		System.out.println("----------------------------------");
		
		MyBean6 obj6 = ctx.getBean("obj6", MyBean6.class);
		System.out.printf("obj6.data1: %s\n", obj6.getData1());
		System.out.printf("obj6.data2: %s\n", obj6.getData2());
		
	}
	
}
