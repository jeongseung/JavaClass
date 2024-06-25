package oop01.class02;

public class A3Test {
	
	public static void main(String[] args) {
		
		A3 a = new A3();
		a.print();
		int k = a.data();
		a.data();
		System.out.println(k);
		double result = a.sum(3,  5.2);
		System.out.println(result);
		a.printMonth(1);
		a.printMonth(15);
		
	}

}
