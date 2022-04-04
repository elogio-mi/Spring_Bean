package info.example.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Class타입 Class명 = new 생성자()
			YourPhone phone1 = new YourPhoneIPhone();
			yourPhone(phone1);
			YourPhone phone2 = new YourPhoneGalaxy();
			yourPhone(phone2);
			//0102소스와 비교시, 비슷한 객체 생성 시, 공통된 부분을 인터페이스로 작성하고,
			//그에 따른 클래스를 상속받게해서 만들면 부모-자식 관계에서 자식에 해당하는 생성자 부분만 수정 후
			//메소드는 그래도 오버라이딩이 되기에, 더이상의 수정이 필요가 없어짐.
	}
	public static void yourPhone(YourPhone phone) {
		phone.sayPhone();
	}
}
