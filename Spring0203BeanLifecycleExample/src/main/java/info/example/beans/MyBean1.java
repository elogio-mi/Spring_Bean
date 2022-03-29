package info.example.beans;

public class MyBean1 {
	public MyBean1() {
		System.out.println("MyBean1의 생성자");
	}
	public void bean1_init() {
		System.out.println("MyBean1의 init메서드");
	}
	public void bean1_destroy() {
		System.out.println("MyBean1의 destroy메서드");
	}
}
