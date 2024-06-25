package basic05.array;

public interface NonRectangleArray {
	public static void main(String[] args) {
		int[][] arr1 = new int[2][];
		arr1[0] = new int[2];
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[1] = new int[3];
		arr1[1][0] = 3;
		arr1[1][1] = 4;
		arr1[1][2] = 5;
		
		System.out.println(arr1[0][0] + " " + arr1[0][1]);
		System.out.println(arr1[1][0] + " " + arr1[1][1] + " " + arr1[1][2]);
		System.out.println();
		
		int[][] arr2 = new int[2][];
		arr2[0] = new int[] {1,2};
		arr2[1] = new int[] {3, 4, 5};
		
		System.out.println(arr2[0][0] + " " + arr2[0][1]);
		System.out.println(arr2[1][0] + " " + arr2[1][1] + " " + arr2[1][2]);
		System.out.println();
		
		int[][] arr3 = new int[][] {{1,2,}, {3,4,5}};
		System.out.println(arr3[0][0] + " " + arr3[0][1]);
		System.out.println(arr3[1][0] + " " + arr3[1][1] + " " + arr3[1][2]);
		System.out.println();
		
		int[][] arr4;
		arr4 = new int[][] {{1,2}, {3,4,5}};
		System.out.println(arr4[0][0] + " " + arr4[0][1]);
		System.out.println(arr4[1][0] + " " + arr4[1][1] + " " + arr4[1][2]);
		System.out.println();
		
		int[][] arr5 = {{1,2},{3,4,5}};
		System.out.println(arr5[0][0] + " " + arr5[0][1]);
		System.out.println(arr5[1][0] + " " + arr5[1][1] + " " + arr5[1][2]);
		System.out.println();
		
		
		
		
		
	}

}
