package info.example.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import info.example.beans.DataBean1;
import info.example.beans.DataBean2;
import info.example.beans.MyBean1;
import info.example.beans.MyBean2;
import info.example.beans.MyBean3;
import info.example.beans.MyBean4;
import info.example.beans.MyBean5;
import info.example.beans.MyBean6;

@Configuration
public class BeanConfigClass {

		@Bean(initMethod = "init1", destroyMethod = "destroy1")
		@Lazy
		public MyBean1 obj1() {
			return new MyBean1();
		}
		
		@Bean(initMethod = "init2", destroyMethod = "destroy2")
		@Lazy
		public MyBean2 obj2() {
			return new MyBean2();
		}

		@Bean(autowire = Autowire.BY_NAME)
		@Lazy
		public MyBean3 obj3() {
			return new MyBean3();
		}
		
		@Bean(autowire = Autowire.BY_NAME)
		@Lazy
		public MyBean4 obj4() {
			return new MyBean4();
		}
		
		@Bean
		@Lazy
		public MyBean5 obj5() {
			return new MyBean5();
		}
		
		@Bean
		@Lazy
		public MyBean6 obj6() {
			return new MyBean6();
		}
		
		@Bean
		public DataBean1 data1() {
			return new DataBean1();
		}
		
		@Bean
		public DataBean2 data2() {
			return new DataBean2();
		}
		
}	