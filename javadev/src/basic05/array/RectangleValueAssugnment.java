package basic05.array;

public class RectangleValueAssugnment {
	public static void main(String[] args) {
		int[][] arr1 = new int[2][3];
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		
		System.out.println(arr1[0][0]+ " " + arr1[0][1] + " " + arr1[0][2]+ " ");
		System.out.println(arr1[1][0]+ " " + arr1[1][1] + " " + arr1[1][2]+ " ");
		System.out.println();
		
		int[][] arr2;
		arr2 = new int[2][3];
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[1][0] = 4;
		arr2[1][1] = 5;
		arr2[1][2] = 6;
		
		System.out.println(arr2[0][0]+ " " + arr2[0][1] + " " + arr2[0][2]+ " ");
		System.out.println(arr2[1][0]+ " " + arr2[1][1] + " " + arr2[1][2]+ " ");
		System.out.println();
		
		//int[][] arr3 = new int[][] {{1,2,3}, }
		
		
		
	}

}
