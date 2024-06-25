package basic03.oper;

public class OpTest03 {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = true;
		
		System.out.println(a && b); //AND
		System.out.println(a && b); //true
		System.out.println(a || b); // OR연산자 true
		System.out.println(!a); //false
		
		a = true; b = false;
		System.out.println(a && b); //false
		System.out.println(a || b); //true
		
		
		a = false; b = true;
		System.out.println(a && b); //false
		System.out.println(a || b); // true
		
		a = false; b = false;
		System.out.println(a && b); //false
		System.out.println(a || b); //false 
		System.out.println(!b); //true
		
	}
}
