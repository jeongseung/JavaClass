package oop09.interface03;

interface A5{
	static void abc() {
		System.out.println("A 인터페이스의 정적 메서드 abc()");
	}
}

public class StaticInterface {
	public static void main(String[] args) {
		//정적 메서드 호출
		A5.abc();
	}
	
	

}
