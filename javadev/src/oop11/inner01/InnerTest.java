package oop11.inner01;

public class InnerTest {
	public static void main(String[] args) {
		A1 a = new A1();
		A1.B b = a.new B();
		b.bcd();
	}
}
