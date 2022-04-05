package info.example.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import info.example.beans.DataBean1;
import info.example.beans.DataBean2;
import info.example.beans.DataBean3;
import info.example.beans.MyBean1;
import info.example.beans.MyBean2;
import info.example.beans.MyBean3;

@Configuration
public class BeanConfigClass {

		@Bean
		@Lazy
		public MyBean1 java1() {
			return new MyBean1(100, "문자열1", new DataBean1());
			//생성자 주입시
		}
		
		//<bean id = java1 , class = info.example.beans.MyBean1, lazy-init = true/>
			
		
		@Bean //(name = "java12")
		@Lazy
		public MyBean1 java2() {
			MyBean1 t1 = new MyBean1();
			t1.setData1(200);
			t1.setData2("문자열2");
			t1.setData3(new DataBean1());
			return t1;
			//setter 주입 시
//			return new MyBean1(200, "문자열2", new DataBean1());
		}
		
		@Bean
		public DataBean2 data1() {
			return new DataBean2();
		}
//		<bean id ='data1' />
		@Bean
		public DataBean2 data2() {
			return new DataBean2();
		}
//		<bean id ='data2' />
		
		@Bean(autowire = Autowire.BY_NAME)
		@Lazy
		public MyBean2 java3() {
			return new MyBean2();
		}
		
		
		@Bean
		public DataBean3 unknown_data() {
			return new DataBean3();
		}
		
		@Bean(autowire = Autowire.BY_TYPE)
		@Lazy
		public MyBean3 java4() {
			return new MyBean3();
		}
}
