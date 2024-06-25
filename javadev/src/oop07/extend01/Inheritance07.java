package oop07.extend01;

class A7 {
	void print1() {
		System.out.println("A클래스 print1");
	}
	void print2() {
		System.out.println("A클래스 print2");
	}
	
	
}
class B7 extends A7 {
	@Override
	void print1() {
		System.out.println("B클래스 print1");
	}
	void print2(int a) {
		System.out.println("B클래스 print2");
	}
	
}

public class Inheritance07 {
	public static void main(String[] args) {
		A7 aa = new A7();
		aa.print1();
		aa.print2();
		System.out.println();
		
		B7 bb = new B7();
		bb.print1();
		bb.print2();
		bb.print2(3);
		System.out.println();
		
		A7 ab = new B7();
		ab.print1();
		ab.print2();
		
	}
	

}
