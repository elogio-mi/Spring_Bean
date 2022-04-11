package info.example.beans;

import javax.annotation.Resource;

public class MyBean6 {
	
		// @Autowired와 @Qualifier = @Resource(name="data1") ???
		@Resource(name="data1")
		private DataBean1 data1;
		
		@Resource(name="data2")
		private DataBean2 data2;

		public DataBean1 getData1() {
			return data1;
		}

		public DataBean2 getData2() {
			return data2;
		}
	
}
