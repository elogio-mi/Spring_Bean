package info.example.javabasic;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			YourPhoneIPhone phone1 = new YourPhoneIPhone();
			yourPhone(phone1);
			YourPhoneIPhone phone2 = new YourPhoneIPhone();
			yourPhone(phone2);
	}
	public static void yourPhone(YourPhoneIPhone phone) {
		phone.sayPhone();
	}
}
