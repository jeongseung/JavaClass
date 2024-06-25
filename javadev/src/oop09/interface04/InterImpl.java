package oop09.interface04;

public class InterImpl implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("methodA() 수행");
	}

	@Override
	public void methodB() {
		System.out.println("methodB() 수행");
	}

	@Override
	public void methodC() {
		System.out.println("methodC() 수행");
	}
}
