package oop07.extend01;

class A10 {
	static int m = 3;
}
class B10 extends A10{
	static int m = 4;
}


public class Inheritance10 {
	public static void main(String[] args) {
		//클래스 명으로 바로 접근
		System.out.println(A10.m);
		System.out.println(B10.m);
		System.out.println();
		
		//객체 생성
		A10 aa = new A10();
		B10 bb = new B10();
		A10 ab = new B10();
		
		//생성한 객체로 정적 필드 호출
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);
	}

}
