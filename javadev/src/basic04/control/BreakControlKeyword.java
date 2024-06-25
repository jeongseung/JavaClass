package basic04.control;

public class BreakControlKeyword {
	public static void main(String[] args) {
		//단일 반복문 탈출
		for(int i=0; i<10; i++) {
			System.out.println(i);
			break;
		}

		for(int i=0; i<10; i++) {
			if(i==5) break;
			System.out.println(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//다중 반복문 탈출 1개
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j == 2 ) {
					break;
				}
				System.out.println(i+ ", "+j);
			}
		}
		
		System.out.println();
		
		//@변수값을 조정해 다중 반복문 탈출
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==2) {
					i = 100;
					break;
				}
				
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();

	}

	
}
