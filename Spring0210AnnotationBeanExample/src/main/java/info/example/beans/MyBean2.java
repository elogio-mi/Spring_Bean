package info.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class MyBean2 {
	
	private int data1;
	private String data2;
	
	@Autowired
	private DataBean3 data3;
	@Autowired
	private DataBean4 data4;
	// ctx1 구문 실행할 때 주석처리 하도록. 나도 모르겠는데 걍 안하면 기본값 -> 0 , null 값 나옴
	public MyBean2() {
		
	}
	
//	생성자 주입 시 자동으로 주입되지 않는 기본 자료형과 문자열의 값을 설정한다.
	public MyBean2(@Value("100") int data1, 
					@Value("문자열") String data2,
								DataBean3 data3,
								DataBean4 data4) {
		
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
		
		
	}

	public int getData1() {
		
		return data1;
	}
	
	public void setData1(int data1) {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	public DataBean3 getData3() {
		return data3;
	}
	
	public void setData3(DataBean3 data3) {
		this.data3 = data3;
	}

	public DataBean4 getData4() {
		return data4;
	}
	
	public void setData4(DataBean4 data4) {
		this.data4 = data4;
	}

	
		
	
}
