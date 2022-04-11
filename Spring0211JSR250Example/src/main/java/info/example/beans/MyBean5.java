package info.example.beans;

import javax.annotation.Resource;

public class MyBean5 {
	// @Autowired와 @Qualifier = @Resource ???
	@Resource
	private DataBean1 data1;
	
	@Resource
	private DataBean2 data2;

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}
	
	
	
}
