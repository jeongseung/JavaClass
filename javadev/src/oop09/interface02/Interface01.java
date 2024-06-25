package oop09.interface02;

interface A1 {
	public static final int a = 3;
	public abstract void abc();
	
}

interface B1 {
	int b = 3;		//생략했을 때 자동으로 public static final
	void bcd();			//생략했을 때 자동으로 public abstract
}

public class Interface01 {
	public static void main(String[] args) {
		//static 자동 추가 확인
		System.out.println(A1.a);
		System.out.println(B1.b);
		
		//final 자동 추가 확인
		//A1.a = 5 	//불가능
		//B1.b = 5  //불가능
		
	}

}
