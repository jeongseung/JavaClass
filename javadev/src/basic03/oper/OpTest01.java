package basic03.oper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in은 기본 표준 입력장치 즉, 키보드를 의미.
		List<Object> list = new ArrayList<>();
		
		System.out.print("정수 a값 입력:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println(a + " % " + b + " = " + (a % b));
		
		
		sc.close();
	}

}
