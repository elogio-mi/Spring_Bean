package info.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import info.example.beans.MyBean1;
import info.example.beans.MyBean2;
import info.example.beans2.MyBean4;

@Configuration
@ComponentScan(basePackages = "info.example.beans2")
public class BeanConfigClass {
	
	@Bean
	public MyBean1 jbean1() {
		return new MyBean1();
	}
	
	@Bean
	public MyBean2 jbean2() {
		return new MyBean2();
	}
	
	@Bean
	public MyBean2 jbean3() {
		return new MyBean2();
	}
	
	@Bean
	public MyBean4 jbean4() {
		return new MyBean4();
	}
	
	@Bean
	public MyBean4 jbean5() {
		return new MyBean4();
	}
}
