package day20_arrays;

public class C02_Arrays01 {

	public static void main(String[] args) {
		// Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		
		int arr[]={1,2,3,4,5};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			toplam+=arr[i];
			
		}
		
		System.out.println("Verilen array'deki tum elementlerin toplami : " + toplam);
	}

}
