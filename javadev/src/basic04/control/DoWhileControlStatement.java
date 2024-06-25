package basic04.control;

public class DoWhileControlStatement {
	public static void main(String[] args) {
		
		//반복 횟수가 0일때 do-while문과 while문 비교
		int a;
		a = 0;
		while(a < 0) {
			System.out.println(a+ " ");
			a++;
		}		// 실행 횟수 0번
		
		System.out.println();
		a = 0;
		do {
			System.out.println(a+" ");
			a++;
		} while(a < 0);
		System.out.println();
		
		
		a = 0;
		while(a<1) {
			System.out.println(a+" ");
			a++;
		}
		System.out.println();
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		} while(a<1);    //실행횟수 1번
		System.out.println();
		
		a = 0;
		while(a<10) {
			System.out.println(a + " ");
			a++;
		}
		System.out.println();
		a = 0;
		do {
			System.out.println(a + " ");
			a++;
		} while(a<10);
	}

}
