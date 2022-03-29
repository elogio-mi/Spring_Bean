package info.example.main;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.example.beans.MyBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		
		
		MyBean1 b1 = ctx.getBean("bean1", MyBean1.class);
		System.out.printf("b1: %s \n", b1);
		
		MyBean1 b2 = ctx.getBean("bean1", MyBean1.class);
		System.out.printf("b2: %s \n", b2);
		
		MyBean1 b3 = ctx.getBean("bean2", MyBean1.class);
		System.out.printf("b3: %s \n", b3);
		
		MyBean1 b4 = ctx.getBean("bean2", MyBean1.class);
		System.out.printf("b4: %s \n", b4);
		
		MyBean1 b5 = ctx.getBean("bean3", MyBean1.class);
		System.out.printf("b5: %s \n", b5);
		
		MyBean1 t6 = ctx.getBean("bean3", MyBean1.class);
		System.out.printf("t6: %s \n", t6);
		
		
		
		
		ctx.close();
	}

}
