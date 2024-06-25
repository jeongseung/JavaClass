package oop01.class02;

public class A12Test {
	public static void main(String[] args) {
		A12 a = new A12();
		a.init(2, 3);
		System.out.println(a.m);
		System.out.println(a.n);
		
		B b = new B();
		b.init(2, 3);
		System.out.println(b.m);
		System.out.println(b.n);
	}

}
