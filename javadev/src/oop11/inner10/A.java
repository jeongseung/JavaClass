package oop11.inner10;

public class A {
	interface B {
		public abstract void bcd();
	}
}

class C implements A.B {
	public void bcd() {
		System.out.println("이너 인터페이스 구현 클래스 생성");
	}
}
