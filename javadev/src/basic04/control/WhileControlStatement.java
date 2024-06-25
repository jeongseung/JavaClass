package basic04.control;

public class WhileControlStatement {
	public static void main(String[] args) {
		int a = 0;
		while(a <10) {
			System.out.println(a + " ");
			a++;
		}
		System.out.println();
		
		//for문으로 변환
		for(int i=0; i<10; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		int b = 10;
		while(b > 0) {
			System.out.println(b + " ");
			b--;
		}
		System.out.println();
		
		//for문으로 변환
		for(int i=10; i > 0; i--) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		//무한 루프 탈출
		int c = 0;
		while(true) {
			if(c>10) {
				break;
			}
			System.out.println(c+" ");
			c++;
		}
	}

}
