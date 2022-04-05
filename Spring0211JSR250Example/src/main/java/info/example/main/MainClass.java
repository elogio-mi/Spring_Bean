package info.example.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.example.beans.DataBean1;
import info.example.beans.MyBean1;
import info.example.beans.MyBean2;
import info.example.beans.MyBean3;
import info.example.beans.MyBean4;
import info.example.config.BeanConfigClass;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MyBean1 obj1 = ctx.getBean("obj1", MyBean1.class);
		MyBean2 obj2 = ctx.getBean("obj2", MyBean2.class);
		System.out.println("----------------------------------");
		
		
		
		MyBean3 obj3 = ctx.getBean("obj3", MyBean3.class);
		MyBean4 obj4 = ctx.getBean("obj4", MyBean4.class);
		System.out.println("----------------------------------");
		
	}
	
}
