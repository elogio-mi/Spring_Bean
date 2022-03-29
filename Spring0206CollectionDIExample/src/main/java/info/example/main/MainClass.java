package info.example.main;

import java.util.List;

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
		
		
		ctx.close();
	}

}
