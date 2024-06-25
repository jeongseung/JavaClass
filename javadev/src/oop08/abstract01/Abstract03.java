package oop08.abstract01;

abstract class A3 {
	abstract void abc();
	
}

class B3 extends A3 {
	void abc() {
		System.out.println("방법1. 자식 클래스 생성 및 추상 메서드 구현");
	}
}

public class Abstract03 {
	
	public static void main(String[] args) {
		A3 b1 = new B3();
		A3 b2 = new B3();
		
		b1.abc();
		b2.abc();
	}

}
