package info.example.main;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.example.beans.DataBean;
import info.example.beans.MyBean1;
import info.example.beans.MyBean2;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		System.out.println("-----------------------------");
				
		

		
		MyBean1 bean = ctx.getBean("bean", MyBean1.class);
		System.out.printf("bean1.data1 : %d\n", bean.getData1());
		System.out.printf("bean1.data2 : %f\n", bean.getData2());
		System.out.printf("bean1.data3 : %s\n", bean.isData3());
		System.out.printf("bean1.data4 : %s\n", bean.getData4());
		System.out.printf("bean1.data5 : %s\n", bean.getData5());
		System.out.printf("bean1.data6 : %s\n", bean.getData6());
		ctx.close();
	}

}
