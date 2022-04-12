package info.example.beans;

import org.springframework.stereotype.Component;

@Component("obj3")
public class DataBean3 {
	public DataBean3() {
		System.out.println("DataBean3의 생성자");
	}
}
