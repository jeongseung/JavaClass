package oop09.interface03;

interface A2 {
	int a = 3;
	void abc();
}

public class CreateObjectOfInterface_2 {
	public static void main(String[] args) {
		//객체 생성
		A2 a1 = new A2() {
			public void abc() {
				System.out.println("방법2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		A2 a2 = new A2() {
			public void abc() {
				System.out.println("방법2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		a1.abc();
		a2.abc();
	}
	

}
