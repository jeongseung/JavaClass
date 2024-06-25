package oop07.extend01;

class A9 {
	int m = 3;
}

class B9 extends A9{
	int m = 4;
}

public class Inheritance09 {
	
	public static void main(String[] args) {
		
		//객체 생성
		A9 aa = new A9();
		B9 bb = new B9();
		A9 ab = new B9();
		
		//인스턴스 필드
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);
	}
}
