package oop07.extend01;

class A12 {
	void abc() {
		System.out.println("A클래스의 abc()");
	}
}

class B12 extends A12 {
	void abc() {
		System.out.println("B클래스의 abc()");
	}
	
	void bcd() {
		abc(); // this.abc;
	}
}

public class Inheritance12 {
	public static void main(String[] args) {
		//객체 생성
		B12 bb = new B12();
		
		bb.bcd();
	}

}
