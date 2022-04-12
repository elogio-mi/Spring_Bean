package info.example.beans;

import org.springframework.stereotype.Component;

@Component("obj2")
public class DataBean2 {
	public DataBean2() {
		System.out.println("DataBean2의 생성자");
	}
}
