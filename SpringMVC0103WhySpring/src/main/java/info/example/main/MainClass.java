package info.example.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.example.beans.YourPhone;

public class MainClass {

	public static void main(String[] args) {
		// beans.xml파일을로딩한다.
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("info/example/config/beans.xml");
		
		// beans.xml에정의한 bean 객체의주소값을가져온다.
		YourPhone phone1 =  (YourPhone) ctx.getBean("phone");
		callMethod(phone1);
		
		YourPhone phone2 = ctx.getBean("phone", YourPhone.class);
		callMethod(phone2);
		
		ctx.close();
		
	}
	public static void callMethod(YourPhone phone) {
		phone.sayPhone();
	}

}


// beans라는 xml파일을 이용해서 다른 결과값을 출력을 해야할 때, java코드를 수정하는 것과 달리
// 이 방식은 xml파일을 수정하는 것만으로도 결과값을 다르게 할 수 있다.



