package oop07.extend01;

class A14 {
	A14() {
		System.out.println("A 생성자");
	}
}

class B14 extends A14 {
	B14() {
		super(); //생략했을 때 컴파일러가 자동 추가 ( 부모 클래스의 생성자 호출)
		System.out.println("B 생성자");
	}
}

class C14 {
	C14(int a) {
		System.out.println("C 생성자");
	}
}

class D14 extends C14 {
	
	//컴파일러가 자동으로 추가해 주는 내용
//	D14() {
//		super;
//	}
	
	D14() {
		super(3);
	}
}

public class Inheritance14 {
	public static void main(String[] args) {
		A14 aa = new A14();
		System.out.println();
		
		B14 bb = new B14();
	}

}
