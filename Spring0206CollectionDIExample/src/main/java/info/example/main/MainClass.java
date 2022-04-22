package info.example.main;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.example.beans.DataBean;
import info.example.beans.MyBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		
		MyBean1 bean = ctx.getBean("bean", MyBean1.class);
		
		List<String> list1 = bean.getList1();
		
		for(String str : list1) {
			System.out.printf("list1 : %s\n", str);
		}
		
		List<Integer> list2 = bean.getList2();
				
		for(int value : list2) {
			System.out.printf("list2 : %d\n", value);
		}
		
		List<DataBean> list3 = bean.getList3();
		
		for(DataBean obj : list3) {
			System.out.printf("list3: %s\n", obj);
		}
		System.out.println("--------------------------------------------");
		
		Set<String> set1 = bean.getSet1();
		
		for(String str : set1) {
			System.out.printf("set1: %s\n", str);
		}
		
		System.out.println("--------------------------------------------");
		Map<String, Object> map1 = bean.getMap1();
		
		String a1 = (String)map1.get("a1");
		int a2 = (Integer)map1.get("a2");
		DataBean a3 = (DataBean)map1.get("a3");
		DataBean a4 = (DataBean)map1.get("a4");
		List<String> a5 = (List<String>)map1.get("a5");
		
		System.out.printf("a1: %s\n", a1);
		System.out.printf("a2: %s\n", a2);
		System.out.printf("a3: %s\n", a3);
		System.out.printf("a4: %s\n", a4);
		for(String str : a5) {
			System.out.printf("a5: %s\n", str);
		}
		
		System.out.println("--------------------------------------------");
		
		Properties prop1 = bean.getProp1();
		
		String p1 = prop1.getProperty("p1");
		String p2 = prop1.getProperty("p2");
		String p3 = prop1.getProperty("p3");
		
		System.out.printf("prop1: %s\n", p1);
		System.out.printf("prop2: %s\n", p2);
		System.out.printf("prop3: %s\n", p3);
		
		
		
		
		
		
		
		
		ctx.close();
	}

}
