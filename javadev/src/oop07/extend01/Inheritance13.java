package oop07.extend01;

class A13 {
	void abc() {
		System.out.println("A클래스의 abc()");
	}
}

class B13 extends A13 {
	void abc() {
		System.out.println("B클래스의 abc()");
	}
	
	void bcd() {
		super.abc();
	}
}

public class Inheritance13 {
	public static void main(String[] args) {
		B13 bb = new B13();
		bb.bcd();
	}
}
