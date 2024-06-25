package oop14.exception1;

public class ATest {
public static void main(String[] args) {
	//실행예외
	//1.ArithmeticExcpetion
//	System.out.println(3 / 0);
	
	//2. ClassCastException
	A a = new A();
//	B b = (B)a;
	
	//3. ArrIndexOutOfBoundsException
	int[] array = {1,2,3};
//	System.out.println(array[3]);
	
//	4. NumberFormatException
//	int num = Integer.parseInt("10!");
	
	//5. NullPointerException
	String str = null;
//	System.out.println(str.charAt(2));
	
	}
}
