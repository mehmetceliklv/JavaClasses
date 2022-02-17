package day07_IfElseStatements;

import java.util.Scanner;

public class C5_IfelseIf01 {

	public static void main(String[] args) {

		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
				// eger uzunluklardan birisi 0 veya daha kucukse
				// "gecerli uzunluk giriniz" yazdirin,
				// uzunluklarin ikisi de pozitif ise
				// dikdortgenin kare olup olmadigini yazdirin
		
		
		Scanner scan =new Scanner (System.in);
				
		
		System.out.println("Lutfen diktortgenin kenarlarini giriniz \nÝlk kenari yazinca enter a basýnýz ");
		
		double kenar1= scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1<=0 ||kenar2<=0) {
			
			System.out.println("Gecerli uzunluk giriniz");
		}
		
		else if ( kenar1==kenar2 ) {
			
			System.out.println("Girdiginiz olculere gore sekil karedir");
		}
			
		else  { 
			
			System.out.println("Girdiginiz olculere gore sekil kare deðildir");

			
		}
		
	}

}
