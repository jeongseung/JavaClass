package oop11.inner09;

public class ATest {
	public static void main(String[] args) {
		C c = new C();
		//방법 3. 클래스명 X + 참조 변수명 O
		A a = new A() {
			public void abc() {
				System.out.println("입력매개변수 전달");
			}
		};
		
		c.cde(a);;
		//방법4. 클래스명X + 참조변수명X
		c.cde(new A() {
			public void abc() {
				System.out.println("입력매개변수 전달");
			}
		});
	}

}
