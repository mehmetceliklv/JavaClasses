package day21_MultidimensionalArray;

import java.util.Arrays;

public class C04_MdArray04 {

	public static void main(String[] args) {
		// Asagidaki multi dimensional array in ic arraylerindeki
		//tum elemanlarin toplamini birer birer bulan ve  
		//herbir sonucu yeni bir arrayin elemani yapan ve yeni array i  
		//ekrana yazdiran bir program yaziniz {{1,2,3},{4,5},{6,7}}
		
	//	{{1,2,3},{4,5},{6,7}}    1+2+3=6 ,4+5=9 ,6+7=13 {6,9,13}
		
		int arr[][]={{1,2,3},{4,5},{6,7}};
		
		int toplamlarArrayi[]=new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			int elementlerToplami=0;
			
			for (int j = 0; j < arr[i].length; j++) {
				
			elementlerToplami+=arr[i][j];
			
			
			}
			toplamlarArrayi[i]=elementlerToplami;
	
			
			
		}
		
		System.out.println(Arrays.toString(toplamlarArrayi));
}

}