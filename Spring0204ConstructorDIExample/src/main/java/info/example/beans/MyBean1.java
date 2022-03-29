package info.example.beans;

public class MyBean1 {

	private int data1;
	private double data2;
	private String data3;
	
	
	public MyBean1() {
		System.out.println("MyBean1의 기본 생성자");
		this.data1 = 0;
		this.data2 = 0.0;
		this.data3 = null;
		
	}
	
	public MyBean1(int data1) {
		System.out.println("MyBean1의 생성자(parm1)!!");
		this.data1 = data1;
		this.data2 = 0.0;
		this.data3 = null;		
	}
		
		public MyBean1(int data1, double data2, String data3) {
			System.out.println("MyBean1의 생성자: 변수 3개");
			this.data1 = data1;
			this.data2 = data2;
			this.data3 = data3;
		}

		@Override
		public String toString() {
			return "MyBean1 [data1=" + data1 + ", data2=" + data2 + ", data3=" + data3 + "]";
		}
	
	
}
