package basic04.control;

import java.util.Scanner;

/**
  q. switch~case
  1~2 남자
  3~4 여자
 */
public class SwitchTest02 {
	public static void main(String[] args) {
		
		System.out.println("입력해주세요");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		String str = switch(n) {
		case 1,3 -> "남자";
		case 2,4 -> "여자";
		default -> "에러";
		};
		System.out.println(str);
		
		
//		
//		switch(n) {
//		case 1, 3:
//			System.out.println("남자");
//			break;
//		case 2, 4:
//			System.out.println("여자");
//			break;
//		default:
//			System.out.println("error");
//		}
	}

}
