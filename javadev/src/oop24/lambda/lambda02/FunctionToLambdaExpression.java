package oop24.lambda.lambda02;

interface A { //입력x 리턴x
	void method1();
}
interface B { //입력O, 리턴X
	void method2(int a);
}
interface C { //입력x, 리턴O
	int method3();
}
interface D { //입력o, 리턴o
	double method4(int a, double b);
}


public class FunctionToLambdaExpression {
	public static void main(String[] args) {
		//인터페이스의 함수 구현 -> 람다식
		//입력,리턴 x
		//익명 이너 클래스방식
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("입력x 리턴x 함수");
			}
		};
		
		//람다식
		A a2 = () -> {System.out.println("입력x 리턴x 함수");};
		A a3 = () -> System.out.println("입력x 리턴x 함수"); //1줄 명령이면 중괄호 생략 가능
		
		//입력o, 리턴x
		B b1 = new B() {
			@Override
			public void method2(int a) {
				System.out.println("입력o 리턴x 함수");
			}
		};
		
		//람다
		B b2 = (int a) -> {System.out.println("입력o 리턴x 함수");};
		B b3 = (a) -> {System.out.println("입력o 리턴x함수");};
		B b4 = (a) -> System.out.println("입력o 리턴x 함수");};
		B b5 = a -> System.out.println("입력o 리턴x 함수");
		
		//입력x 리턴o
		C c1 = new C() {
			
			@Override
			public int method3() {
				return 4;
			}
		};
		
		C c2 = () -> {return 4;};
		C c3 = () -> 4;
		
		//입력O 리턴O
		D d1 = new D() {
			
			@Override
			public double method4(int a, double b) {
				return a+b;
			}
		};
		
		D d2 = (int a, double b) -> {return a+b;};
		D d3 = (a,b) -> {return a+b;};
		D d4 = (a,b) -> a + b;
		
}
