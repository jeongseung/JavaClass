package oop01.class02;



class A14 {
	int m1, m2, m3, m4;
	
	A14() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
		
	}
	
	A14(int a) {
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
		
	}
	
	A14(int a, int b) {
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
		
	}
	
	void print() {
		System.out.println(m1 + " ");
		System.out.println(m2 + " ");
		System.out.println(m3 + " ");
		System.out.println(m4);
		System.out.println();
	}
}

class B5 {
	int m1,m2,m3,m4;
	
	B5() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	B5(int a) {
		this();
		m1 = a;
	}
	
	
	B5(int a, int b) {
		this(a);
		m2 = b;
	}
	
	void print() {
		System.out.println(m1 + " ");
		System.out.println(m2 + " ");
		System.out.println(m3 + " ");
		System.out.println(m4);
		System.out.println();
	}
	
	
	
	
}


public class ThisMethod_2 {
	public static void main(String[] args) {
		A14 a1 = new A14();
		A14 a2 = new A14(10);
		A14 a3 = new A14(10,20);
		a1.print();
		a2.print();
		a3.print();
		System.out.println();
		
		B5 b1 = new B5();
		B5 b2 = new B5(10);
		B5 b3 = new B5(10, 20);
		b1.print();
		b2.print();
		b3.print();
	}
}