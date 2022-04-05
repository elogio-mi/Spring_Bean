package info.example.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import info.example.beans.DataBean1;
import info.example.beans.DataBean2;
import info.example.beans.MyBean1;

@Configuration
public class BeanConfigClass {

		@Bean
		@Lazy
		public MyBean1 java1() {
			return new MyBean1(100, "문자열1", new DataBean1());
		}
		
		@Bean
		@Lazy
		public MyBean1 java2() {
			MyBean1 t1 = new MyBean1();
			t1.setData1(200);
			t1.setData2("문자열2");
			t1.setData3(new DataBean1());
			return t1;
		}
		
		@Bean
		public DataBean2 data1() {
			return new DataBean2();
		}
		
		@Bean
		public DataBean2 data2() {
			return new DataBean2();
		}
		
		@Bean(autowire = Autowire.BY_NAME)
		@Lazy
		public DataBean2 java3() {
			return new DataBean2();
		}
}
