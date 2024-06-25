package oop07.extend01;

class A15 {
	A15() {
		this(3);
		System.out.println("A 생성자 1");
	}
	A15(int a) {
		System.out.println("A 생성자 2");
	}
	
}

class B15 extends A15 {
	B15() {
		this(3);
		System.out.println("B 생성자 1");
	}
	B15(int a) {
		System.out.println("B 생성자 2");
	}
}

public class Inheritance15 {
	public static void main(String[] args) {
		A15 aa1 = new A15();
		System.out.println();
		A15 aa2 = new A15();
		System.out.println();
		
		B15 bb1 = new B15();
		System.out.println();
		B15 bb2 = new B15(3);
	}
}
