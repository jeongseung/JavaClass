package basic03.oper;

import java.util.Scanner;

/**
 * Q. 정수를 입력받아 짝수인지 홀수인지 판별(삼항연산자와 Scanner 클래스 이용)
 */
public class Optest10 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(a%2 == 0 ? "짝수입니다 " : "홀수입니다");
		
		sc.close();
	}
}
