package info.example.beans;

public class MyBean1 {

	private int data1;
	private String data2;
	private DataBean1 data3;
	
	public MyBean1() {
		System.out.println("MyBean1의 생성자");
	}

	public MyBean1(int data1, String data2, DataBean1 data3) {
		super();
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
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

	public DataBean1 getData3() {
		return data3;
	}

	public void setData3(DataBean1 data3) {
		this.data3 = data3;
	}
	
	
	
}
