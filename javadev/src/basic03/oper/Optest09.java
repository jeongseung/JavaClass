package basic03.oper;

import java.util.Scanner;

public class Optest09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력해주세요 : ");
		int n = sc.nextInt();
		
		System.out.println(
				n==1 || n==3 ? "남자입니다" : 
				n==2 || n==4 ? "여자입니다" :
				"error");
		
		sc.close();
	}

}
