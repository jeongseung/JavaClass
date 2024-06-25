package basic03.oper;

/**
 * q1. 난수 발생
 * 4 ~ 15 사이의 정수 발생
 * 
 * q2. 600 ~ 2300사이의 100단위 정수 발생  600 700 800
 */
public class Optest12 {
	public static void main(String[] args) {
		
		System.out.println((int) (Math.random() * 12) + 4);
		System.out.println((int) ((Math.random() * 18) + 6)*100);
	}
}
