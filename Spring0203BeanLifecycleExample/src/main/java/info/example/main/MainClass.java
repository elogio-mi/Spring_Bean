package info.example.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.example.beans.MyBean1;
import info.example.beans.MyBean2;
import info.example.beans.MyBean3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		
		MyBean1 b1 = ctx.getBean("b1", MyBean1.class);
		System.out.printf("b1 %s\n", b1);
		
		System.out.println("-----------------------------");
		
		MyBean2 b2 = ctx.getBean("b2", MyBean2.class);
		System.out.printf("b2 %s\n", b2);
		
		System.out.println("-----------------------------");
		
		MyBean3 b3 = ctx.getBean("b3", MyBean3.class);
		System.out.printf("b3 %s\n", b3);
		
		System.out.println("-----------------------------");
		
	}

}
