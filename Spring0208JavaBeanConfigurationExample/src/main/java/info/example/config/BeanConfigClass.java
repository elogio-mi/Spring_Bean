package info.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import info.example.beans.MyBean1;

@Configuration
public class BeanConfigClass {

		@Bean
		public MyBean1 java1() {
			MyBean1 t1 = new MyBean1();
			return t1;
		}
		
		@Bean(name="java12")
		public MyBean1 java11() {
			MyBean1 t1 = new MyBean1();
			return t1;
		}
}
