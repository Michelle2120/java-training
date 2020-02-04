package Tutorials;

public class MyPhoneApp {
	public static void main(String[] args) {
		// Use singular name when creating classes
	    Phone myPhone = new Phone();
		myPhone.phoneName = "Huawei";
		myPhone.memory = 8;
		myPhone.functions = "(Texting, Calling , Music)";
		myPhone.goodbatteryLife =true;
		myPhone.durability =false;
		System.out.println(myPhone.memory);
	}
}
