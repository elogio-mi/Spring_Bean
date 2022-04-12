package info.example.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import info.example.beans.MyBean1;
import info.example.beans.MyBean2;
import info.example.beans.MyBean3;
import info.example.config.BeanConfigClass;




public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		
		AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MyBean1 obj1 = ctx1.getBean(MyBean1.class);
		System.out.printf("obj1.data1: %s\n",obj1.getData1());
		System.out.printf("obj1.data2: %s\n",obj1.getData2());
		System.out.printf("obj1.data3: %s\n",obj1.getData3());
		
		System.out.printf("obj1.data4: %s\n",obj1.getData4());
		System.out.printf("obj1.data5: %s\n",obj1.getData5());
		
		
		ctx1.close();
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MyBean2 obj2 = ctx2.getBean(MyBean2.class);
		System.out.printf("obj2.data1: %s\n",obj2.getData1());
		System.out.printf("obj2.data2: %s\n",obj2.getData2());
		System.out.printf("obj2.data3: %s\n",obj2.getData3());
		System.out.printf("obj2.data4: %s\n",obj2.getData4());
		
		ctx2.close();
		
		AnnotationConfigApplicationContext ctx3 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		
		MyBean3 obj3 = ctx3.getBean("t3",MyBean3.class);
		
		// configclass에서 직접 id값을 지정한 빈을 찾아가 생성자 주입을 한다.
		System.out.printf("obj3.data1: %s\n",obj3.getData1());
		System.out.printf("obj3.data2: %s\n",obj3.getData2());
		System.out.printf("obj3.data3: %s\n",obj3.getData3());
		System.out.printf("obj3.data4: %s\n",obj3.getData4());
		ctx3.close();
	}
	
}
