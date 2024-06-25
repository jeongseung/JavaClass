package oop09.interface04;

public class InterfaceTest {
	
	public static void main(String[] args) {
		InterImpl impl = new InterImpl();
		InterfaceA is = impl;
		is.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
		
	}

}
