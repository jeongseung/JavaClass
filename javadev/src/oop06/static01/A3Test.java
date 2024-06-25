package oop06.static01;

class A3 {
	void abc() {
		System.out.println("instance 메서드");
	}
	
	static void bcd() {
		System.out.println("static 메서드");
	}
}

public class A3Test {
	public static void main(String[] args) {
		A3 a1 = new A3();
		a1.abc();
		
		A3.bcd();
		
		A3 a2 = new A3();
		a2.bcd();
	}
}
