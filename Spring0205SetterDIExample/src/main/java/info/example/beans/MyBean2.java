package info.example.beans;

public class MyBean2 {
	
	private DataBean data4;
	private DataBean data5;
	
	public MyBean2(DataBean data4, DataBean data5) {
		this.data4 = data4;
		this.data5 = data5;
	}

	@Override
	public String toString() {
		return "MyBean2 [data4=" + data4 + ", data5=" + data5 + "]";
	}
	
	
}
