package oop04.test;

import oop05.modifier01.A;

public class D extends A {
	
	public void print() {

		System.out.print(a + " ");    //다른 패키지 내의 클래스에는 자식 클래스가 아닌 경우 public만 접근 가능 
		System.out.print(b + " ");
//		System.out.print(c + " ");
//		System.out.print(a.d + " "); // private
	}
		
	
	
	
	

}
