package info.example.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import info.example.beans.DataBean3;
import info.example.beans.DataBean4;
import info.example.beans.DataBean5;
import info.example.beans.MyBean1;
import info.example.beans.MyBean2;
import info.example.beans.MyBean3;



@Configuration
@ComponentScan(basePackages = "info.example.beans")
public class BeanConfigClass {

	@Bean
	public DataBean3 obj4() {
		return new DataBean3();
	}
	
	@Bean
	public DataBean3 obj5() {
		return new DataBean3();
	}
	
	@Bean
	public MyBean3 t3() {
		return new MyBean3(100, "초기값", new DataBean4(), new DataBean5());
	}
}	