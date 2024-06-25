package basic04.control;

import java.util.Scanner;

/*
 * 향상된 스위치문
 * 계절을 출력합니다. 현재 월을 입력하세요 : 8
 * 여름
 */
public class SwitchTest04 {
	public static void main(String[] args) {
		
		System.out.print("현재 월을 입력해주세요 :" );
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		String season = switch(month) {
		case 4,5 -> "봄";
		case 6,7,8,9 -> "여름";
		case 10, 11 -> "가을";
		default -> "겨울";
		};
		
		System.out.printf("%d월은 %s 입니다", month, season);
	}
}
