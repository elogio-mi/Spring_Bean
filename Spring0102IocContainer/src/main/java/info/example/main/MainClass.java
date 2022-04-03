package info.example.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import info.example.beans.MyBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2();
	}
	public static void test1() {
		ClassPathResource res = 
				new ClassPathResource("info/example/config/beans.xml");
		XmlBeanFactory factory = 
				new XmlBeanFactory(res);
		// 외부에 있는 파일 소스 를 classpathresoure 클래스를 이용해서 불러오고, 
		// xmlbeanfactory 클래스가 IOC 컨테이너라고도 할 수 있는데, 이걸로 빈 정보를 불러와
		
		
		MyBean1 b1 = factory.getBean("t1", MyBean1.class);
		//이러한 형식으로 객체를 생성함.
		// 하지만 퇴색된 방법으로 이런 방식으로도 쓸 수 있다라고 알아두면 됨.
		System.out.println("b1객체정보(주소값): " + b1);
		//MyBean2 t1 = factory.getBean("t1", MyBean.class);
		//System.out.println("t2객체정보: " + b2);
	}
	
	public static void test2() {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		
		MyBean1 b1 = ctx.getBean("t1", MyBean1.class);
		System.out.println("b1객체정보(주소값): " + b1);
		MyBean1 b2 = ctx.getBean("t1", MyBean1.class);
		System.out.println("b2객체정보: " + b2);
		
		ctx.close();
	}
}
