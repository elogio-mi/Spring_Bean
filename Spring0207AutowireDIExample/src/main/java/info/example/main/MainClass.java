package info.example.main;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.example.beans.DataBean1;
import info.example.beans.MyBean1;
import info.example.beans.MyBean2;
import info.example.beans.MyBean3;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		System.out.println("-----------------------------");
				
	
		MyBean1 obj1 = ctx.getBean("obj1", MyBean1.class);
		System.out.printf("obj1.data1 : %s\n", obj1.getData1());
		System.out.printf("obj1.data2 : %s\n", obj1.getData2());
		System.out.println("-----------------------------");
		
		MyBean1 obj2 = ctx.getBean("obj2", MyBean1.class);
		System.out.printf("obj2.data1 : %s\n", obj2.getData1());
		System.out.printf("obj2.data2 : %s\n", obj2.getData2());
		System.out.println("-----------------------------");
		
		MyBean2 obj3 = ctx.getBean("obj3", MyBean2.class);
		System.out.printf("obj3.data1 : %s\n", obj3.getData1());
		System.out.printf("obj3.data2 : %s\n", obj3.getData2());
		System.out.println("-----------------------------");
		
		MyBean3 obj5 = ctx.getBean("obj5", MyBean3.class);
		System.out.printf("obj5.data1 : %d\n", obj5.getData1());
		System.out.printf("obj5.data2 : %s\n", obj5.getData2());
		System.out.printf("obj5.data1 : %s\n", obj5.getData3());
		System.out.printf("obj5.data2 : %s\n", obj5.getData4());
		System.out.println("-----------------------------");
		ctx.close();
	}

}
