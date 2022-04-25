package info.example.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import info.example.beans.DataBean1;
import info.example.beans.DataBean2;
import info.example.beans.DataBean3;
import info.example.beans.DataBean4;
import info.example.beans.MyBean1;
import info.example.beans.MyBean2;
import info.example.beans.MyBean3;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public MyBean1 java1() {
		return new MyBean1();
	}
	
	//data_bean인 이유는 MyBean1의 autowire 속성 사용하기 위해서. 그거 아니였음 필요도 없음.
	@Bean
	public DataBean1 data_bean1() {
		return new DataBean1();
	}
	
	@Bean
	public DataBean2 obj4() {
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 obj5() {
		return new DataBean2();
	}
	
	
	
	
	@Bean
	public DataBean3 data3() {
		return new DataBean3();
	}
	
	@Bean
	public DataBean4 data4() {
		return new DataBean4();
	}
	
	
	@Bean
	public MyBean2 java2() {
		return new MyBean2();
	}
}
		
