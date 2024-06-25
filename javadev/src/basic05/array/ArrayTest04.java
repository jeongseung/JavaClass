package basic05.array;

public class ArrayTest04 {
	public static void main(String[] args) {
		int[][][] score = {  
				{
					{100, 90, 80, 70},
					{90, 80, 70, 60},
					{80, 70, 60, 50}
				},
				{
					{100, 100, 90, 80},
					{100, 90, 80, 70},
					{90, 80, 70, 60}
					
				}
		};
		
		System.out.println("\t\t[성적표]");
		System.out.println("================================================");
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		
		for (int t = 0; t < score.length; t++) {

			for (int i = 0; i < score[t].length; i++) {
				int sum = 0;
				for (int j = 0; j < score[t][i].length; j++) {
					sum += score[t][i][j];
					System.out.print(score[t][i][j] + "\t");
				}
				System.out.print(sum + "\t");
				System.out.print(sum / score[t][i].length);
				System.out.println();
			}
			System.out.println();
			System.out.println("================================================");
			System.out.println();

		}
	}
}
