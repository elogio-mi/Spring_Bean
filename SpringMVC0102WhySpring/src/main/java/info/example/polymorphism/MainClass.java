package info.example.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			YourPhone phone1 = new YourPhoneIPhone();
			yourPhone(phone1);
			YourPhone phone2 = new YourPhoneGalaxy();
			yourPhone(phone2);
	}
	public static void yourPhone(YourPhone phone) {
		phone.sayPhone();
	}
}
