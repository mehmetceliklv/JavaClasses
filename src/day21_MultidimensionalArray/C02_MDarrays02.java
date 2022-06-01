package day21_MultidimensionalArray;

public class C02_MDarrays02 {

	public static void main(String[] args) {
		// Asagidaki multidimensional array in tum 
		//elemanlarinin carpimini ekrana yazdiran bir metod yaziniz.
		//{{1,2,3},{4,5,6}}
		
		int arr[][]={{1,2,3},{4,5,6}};
		int carpim =1;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				carpim*= arr[i][j];
				
				
			}
		}
		System.out.println("Tum elementlerin carpimi: "+ carpim );
	}

}
