package oop07.object;

class A4 {
	int a = 3;
	final int b = 5;
	A4() {
		
	}
}

class A5 {
	int a;
	final int b;
	A5() {
		a = 3;
		b = 5;
	}
}

class A6 {
	int a = 3;
	final int b = 5;
	A6() {
		a = 5;
		//b = 5 -> final 필드는 최초 선언된 이후 값을 대입할 수 없음
	}
}

class B4 {
	void bcd() {
		int a = 3;
		final int b = 5;
		a = 7;
		//b = 9 -> 지역 변수도 최초 선언된 이후 값을 대입할 수 없음
	}
}

public class Final01 {
	
	public static void main(String[] args) {
		A4 a1 = new A4();
		A5 a2 = new A5();
		a1.a = 7;
		a2.a = 7;
		//.b들은 값을 넣을 수 없음
	}
	

}
