package oop07.extend01;

class A1 {}
class B1 extends A1 {}
class C1 extends B1 {}
class D1 extends B1 {}


public class Inheritance02 {
	public static void main(String[] args) {
		
		//업캐스팅(자동 변환) : 캐스팅 구문을 생략했을 때 컴파일러가 자동으로 추가
		A1 ac = (A1) new C1(); //C -> A업캐스팅(자동 변환)
		B1 bc = (B1) new C1(); // c-> B 업캐스팅(자동 변환)
		
		B1 bb = new B1();
		A1 a = (A1) bb;
		
		//다운캐스팅(수동 변환) : 캐스팅 할 수 없을때 (실행할 때 예외 발생)
		A1 aa = new A1();
		//B1 b = (B1) aa; // A - > B다운캐스팅(수동 변환) : 불가능
//		C1 c = (C1) aa; //A -> C 다운캐스팅(수동 변환) : 불가능
		
		//다운캐스팅(수동변환) : 캐스팅이 가능할 때
		A1 ab = new B1();
		B1 b = (B1) ab; // A -> B 다운캐스팅(수동변환)
//		C1 c = (C1) ab; // A->c 다운캐스팅(수동 변환) : 불가능
		
		B1 bd = new D1();
		D1 d = (D1) bd; // B->D 다운캐스팅 (수동 변환)
		
		A1 ad = new D1();
		B1 b1 = (B1) ad; //A -> B 다운캐스팅(수동 변환)
		D1 d1 = (D1) ad; //A -> D 다운캐스팅(수동 변환)
		
		
	}
}
