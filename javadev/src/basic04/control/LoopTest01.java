package basic04.control;

/*
 * 
 */
public class LoopTest01 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j>=i) System.out.println("*");
				else System.out.println(" ");
			}
		}
		
	}

}
