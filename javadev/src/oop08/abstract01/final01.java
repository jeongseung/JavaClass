package oop08.abstract01;

class A {
	void abc() {}
	final void bcd() {}
}

class B extends A {
	void abc() {}
	//void bcd() {} -> final 메서드는 오버라이딩 불가능
}

final class C {}
//class D extends C{} -> final 클래스는 상속 자체가 불가능

public class final01 {

}
