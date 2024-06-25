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
public class IfTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80) {
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		} else if(score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		sc.close();
	}
}
