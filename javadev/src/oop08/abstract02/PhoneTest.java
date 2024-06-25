package oop08.abstract02;

public class PhoneTest {
	
	public static void main(String[] args) {
		Phone p = new SmartPhone("jsw");
		p.turnOn();
		p.internetSearch();
		System.out.println(p.owner);
		p.turnOff();
	}
}
