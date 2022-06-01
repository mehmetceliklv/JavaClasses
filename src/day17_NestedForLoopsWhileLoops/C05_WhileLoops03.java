package day17_NestedForLoopsWhileLoops;

import java.util.Scanner;

public class C05_WhileLoops03 {

	public static void main(String[] args) {
		/*
		 Soru 4) Kullanicidan baslangic ve bitis haflerini alin 
		 ve baslangic harfinden baslayip bitis harfinde biten 
		 tum harfleri buyuk harf olarak ekrana yazdirin. 
		 Kullanicinin hata yapmadigini farz edin.
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen ilk harfi giriniz");
		
		char ilkHarf= scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lutfen ikinci harfi giriniz");
		
		char sonHarf= scan.next().toUpperCase().charAt(0);
		
		char harf= ilkHarf;
		
		while (harf<=sonHarf) {
			System.out.print(harf+ " ");
			harf+=1;
		}
		
	}

}
