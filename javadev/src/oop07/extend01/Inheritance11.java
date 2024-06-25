package oop07.extend01;

class A11 {
	static void print() {
		System.out.println("A 클래스");
	}
}

class B11 extends A11 {
	static void print() {
		System.out.println("B 클래스");
	}
}

public class Inheritance11 {
	public static void main(String[] args) {
		//클래스명으로 바로 접근
		A11.print();
		B11.print();
		System.out.println();
		
		//객체 생성
		A11 aa = new A11();
		B11 bb = new B11();
		A11 ab = new B11();
		
		aa.print();
		bb.print();
		ab.print();
	}

}
