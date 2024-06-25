package oop11.inner08;

interface A {
	public abstract void abc();
}

//자식 클래스 직접 생성
class B implements A {
	public void abc() {
		System.out.println("입력매개변수 전달");
	}
}
class C {
	void cde(A a) {
		a.abc();
	}
}