package basic04.control;

public class ContinueTest01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%3!=0) continue; //continue 이하의 문장들은 생략 
			sum += i;
			
		}
		System.out.println("1부터 10까지 3의 배수의 합계는 " + sum + " 입니다");
	}
}
