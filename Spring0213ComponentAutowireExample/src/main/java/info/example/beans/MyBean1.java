package info.example.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class MyBean1 {

			
	
	@Autowired
	private DataBean1 data1;
	
	@Autowired
	@Qualifier("obj2")
	private DataBean2 data2;
	
	
	//이건 왜 아래랑 충돌 안하냐고? 아마도 databean3에 @Component("obj3") ㅇㅈㄹ해서 그런듯
	@Resource(name = "obj3")
	private DataBean3 data3;
	
	//같은 타입 빈 --> resource로 다른 id값으로 지정.  @Component 사용 불가능. --> 설정파일에서 빈 선언하기.
	@Resource(name = "obj4")
	private DataBean3 data4;
	
	@Resource(name = "obj5")
	private DataBean3 data5;
	
	
	

	public DataBean3 getData4() {
		return data4;
	}

	public DataBean3 getData5() {
		return data5;
	}

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}

	public DataBean3 getData3() {
		return data3;
	}
	
	
	
	
}
