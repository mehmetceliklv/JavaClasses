package day21_MultidimensionalArray;

import java.util.Arrays;

public class C01_MultiDArray {

	public static void main(String[] args) {
		
		int arr [][]= {{1},{2,3,4},{5,6,7,8}};
		//Bu array i nested for loop ile yazdiralim.
		
		for (int i = 0; i < arr.length; i++) { // bu loop outer array in elementlerini getirir.
			
			// arr[i]  // arr[0]  arr[1] arr[2]
			
			for (int j = 0; j < arr[i].length; j++) {
				System.err.print(arr[i][j]+" ");
			}
			
			System.out.println("");
		}
		
			System.out.println(Arrays.deepToString(arr));
		
		
		
	}

}
