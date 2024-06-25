package oop09.interface03;

interface A1 {
	int a  = 3;
	void abc();
}

class B1 implements A1 {
	public void abc() {
		System.out.println("방법1. 자식 클래스 생성자로 객체 생성");
	}
}

public class CreateObjectOfInterface_1 {
	public static void main(String[] args) {
		A1 b1 = new B1();
		A1 b2 = new B1();
		
		b1.abc();
		b2.abc();
	}
}
