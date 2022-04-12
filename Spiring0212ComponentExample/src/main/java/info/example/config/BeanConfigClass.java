package info.example.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import info.example.databeans.DataBean1;
import info.example.databeans.DataBean2;
import info.example.beans.MyBean1;
import info.example.beans.MyBean2;
import info.example.beans2.MyBean3;
import info.example.beans2.MyBean4;


@Configuration
public class BeanConfigClass {

		@Bean
		public MyBean1 java1() {
			return new MyBean1();
		}
		
		@Bean
		public MyBean2 java2() {
			return new MyBean2();
		}
		
		@Bean
		public MyBean3 java3() {
			return new MyBean3();
		}

		
	
		
}	