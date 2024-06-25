package oop07.extend01;

public class Inheritance03 {
	public static void main(String[] args) {
		A3 aa = new A3();
		System.out.println(aa.m);
		aa.abc();
		
		System.out.println();
		
		B3 bb = new B3();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		System.out.println();
		
		A3 ab = new B3();
		System.out.println(ab.m);
		ab.abc();
	}

}
