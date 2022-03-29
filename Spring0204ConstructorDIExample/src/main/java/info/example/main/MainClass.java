package info.example.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.example.beans.DataBean;
import info.example.beans.MyBean1;
import info.example.beans.MyBean2;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------------------------");
		
		MyBean1 t1 = new MyBean1();
		t1.toString();
		System.out.println(t1.toString());
		
		MyBean1 t2 = new MyBean1(200);
		t2.toString();
		System.out.println(t2.toString());
		
		MyBean1 t3 = new MyBean1(300, 300.3, "나 프로그래머?");
		t3.toString();
		System.out.println(t3.toString());
		
		System.out.println("-----------------------------");
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		
		MyBean1 b1 = ctx.getBean("b1", MyBean1.class);		
		System.out.println(b1.toString());
		
		System.out.println("-----------------------------");
		
		MyBean1 b2 = ctx.getBean("b2", MyBean1.class);
		System.out.println(b2.toString());
		
		System.out.println("-----------------------------");
		
		MyBean1 b3 = ctx.getBean("b3", MyBean1.class);
		System.out.println(b3.toString());
		
		MyBean2 b4 = ctx.getBean("b4", MyBean2.class);
		System.out.println(b4.toString());
		
		System.out.println("-----------------------------");
		
	}

}
