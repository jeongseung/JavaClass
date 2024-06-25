package basic04.control;

public class BreakTest01 {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		while(true) {
			sum += i;
			if(sum>=100) break; //break가 속해있는 반복문 탈출
			i++;
		}
		
		System.out.println("1부터" + i + "까지 합계는 " + sum);
	}

}
