package basic04.control;

/*
 * 1부터 1000까지 정수 중 3의 배수의 합을 구하시오
 */
public class WhileTest02 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(i<=1000) {
			if(i%3==0) sum+=i;
			i++;
		}
		
		System.out.println("3의 배수의 총합은 : " + sum + "입니다");
	}

}
