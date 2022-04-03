package info.example.javabasic;

public class MainClass {
	//다형성 X
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Class타입 Class명 = new 생성자()
			YourPhoneIPhone phone1 = new YourPhoneIPhone();
			yourPhone(phone1);
			YourPhoneIPhone phone2 = new YourPhoneIPhone();
			yourPhone(phone2);
			//일반적으로 객체지향방식으로 작성시, 클래스를 생성하고 
			//클래스에 대한 인스턴스 변수를 생성하며 사용된다.
			//하지만 내용 수정시, 생성자까지 바꿔줘야함으로 코드의 수정량이 다소 많다.
	}
	public static void yourPhone(YourPhoneIPhone phone) {
		phone.sayPhone();
	}
}
