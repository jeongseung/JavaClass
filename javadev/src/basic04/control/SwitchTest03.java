package basic04.control;

import java.util.Scanner;
/**
 * score(if)
 * 0부터 100사이 점수를 입력받아서
 * 90점 이상이면 A 출력
 * 80점 이상 90점 미만 B
 * 70점 이상 80점 미만 C
 * 60점 이상 70점 미만 D
 * 그 외 F
 */
public class SwitchTest03 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		System.out.println(score);
		
//		switch(score/10) {
//		case 9, 10:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("D");
//			break;
//		case 6:
//			System.out.println("C");
//			break;
//		default:
//			System.out.println("F");
//			break;
//		}
		
		char grade = switch(score/10 ) {
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		default -> 'F';
		};
		
		System.out.printf("%d학점은 %c학점입니다\n" ,score , grade);
		
	}

}
