package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C3_Ifstatements02 {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
				
		System.out.println("Lütfen bir sayý giriniz");
		
		int girilensayi=scan.nextInt();
		
		if(girilensayi%2==0) {
			System.out.println("Girdiginiz sayi çift sayi");
		}
		
		if(girilensayi%2==1) {
			System.out.println("Girdiginiz sayi tek sayi");
		}
		
		if(girilensayi<0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");
		}
		
		
	}
	

}
