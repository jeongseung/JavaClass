package oop09.interface03;

interface A4 {
	void abc();
	
	default void bcd() {
		System.out.println("A인터페이스의 BCD()");
	}
	
}

class B4 implements A4 {

	@Override
	public void abc() {
		A4.super.bcd();
		System.out.println("B클래스의 abc()");
	}
}

class C4 implements A4 {
	@Override
	public void abc() {
		System.out.println("C클래스의 abc()");
	}
	
	@Override
	public void bcd() {
		System.out.println("C클래스의 bcd()");
	}
}



public class Interface04 {
	public static void main(String[] args) {
		A4 a1 = new B4();
		A4 a2 = new C4();
		
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();
		
	}
}
