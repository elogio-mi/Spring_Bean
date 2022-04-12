package info.example.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import info.example.databeans.DataBean1;
import info.example.databeans.DataBean2;
import info.example.beans.MyBean1;
import info.example.beans.MyBean2;
import info.example.beans2.MyBean3;
import info.example.beans2.MyBean4;


@Configuration
@ComponentScan(basePackages = "info.example.beans2")
public class BeanConfigClass2 {

		@Bean
		public MyBean4 java100() {
			return new MyBean4();
		}
		
		@Bean
		public MyBean4 java200() {
			return new MyBean4();
		}

		
	
		
}	