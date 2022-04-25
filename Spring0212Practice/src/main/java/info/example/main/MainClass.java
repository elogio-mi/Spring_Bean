package info.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.example.beans.MyBean1;
import info.example.beans.MyBean2;
import info.example.beans2.MyBean3;
import info.example.beans2.MyBean4;
import info.example.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		acac2();
	}
	
	
	public static void cpxac1() {
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		
		MyBean1 b1 = cpxac.getBean("xml1", MyBean1.class);
		System.out.printf("xml1: %s\n",b1);
		
		MyBean1 b2 = cpxac.getBean("xml2", MyBean1.class);
		System.out.printf("xml2: %s\n",b2);
		
		MyBean2 obj = cpxac.getBean(MyBean2.class);
		System.out.printf("bean2: %s\n",obj);
		cpxac.close();
	}
	
	public static void acac1() {
		
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MyBean1 jb1 = acac.getBean(MyBean1.class);
		System.out.printf("jbean1: %s\n",jb1);
		
		MyBean2 jb2 = acac.getBean("jbean2",MyBean2.class);
		System.out.printf("jbean2: %s\n",jb2);
		
		MyBean2 jb3 = acac.getBean("jbean3",MyBean2.class);
		System.out.printf("jbean3: %s\n",jb3);
		acac.close();
	}
	
	
	public static void cpxac2() {
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		
		MyBean3 xcomp1 = cpxac.getBean(MyBean3.class);
		System.out.printf("xcomp3: %s \n",xcomp1);
		
		MyBean4 b2b0 = cpxac.getBean("bean4",MyBean4.class);
		System.out.printf("b2b0: %s \n",b2b0);
		
		MyBean4 b2b1 = cpxac.getBean("b2b1",MyBean4.class);
		System.out.printf("b2b1: %s \n",b2b1);
		
		MyBean4 b2b2 = cpxac.getBean("b2b2",MyBean4.class);
		System.out.printf("b2b2: %s \n",b2b2);
		
		cpxac.close();
	}
	
	public static void acac2() {
		
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MyBean3 jcomp1 = acac.getBean(MyBean3.class);
		System.out.printf("jcomp1: %s\n",jcomp1);
		
		MyBean4 b2b0 = acac.getBean("bean4",MyBean4.class);
		System.out.printf("b2b0: %s \n",b2b0);
		
		MyBean4 b2b1 = acac.getBean("jbean4",MyBean4.class);
		System.out.printf("b2b1: %s \n",b2b1);
		
		MyBean4 b2b2 = acac.getBean("jbean5",MyBean4.class);
		System.out.printf("b2b2: %s \n",b2b2);
		
		acac.close();

	}
	
	
	
}
