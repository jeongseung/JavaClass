package basic05.array;

public class ArrayTest05 {
	public static void main(String[] args) {
		int[][] score = {  //2차원 배열의 길이는 score.length = 3;
				{100, 90, 80, 70},
				{90, 80, 70, 60},
				{80, 70, 60, 50}
		};
		
		System.out.println("\t\t[성적표]");
		System.out.println("================================================");
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j]; 
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(sum + "\t");
			System.out.print(sum / score[i].length);
			System.out.println();
		}
	}
}
