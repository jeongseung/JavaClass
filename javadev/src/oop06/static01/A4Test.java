package oop06.static01;

class A4 {
	int a;
	static int b;
	static {
		b = 5;
		System.out.println("클래스 A가 로딩됐습니다!");
	}
	
	A4() {
		a = 3;
	}
}

public class A4Test {
	public static void main(String[] args) {
		System.out.println(A4.b);
	}
}
