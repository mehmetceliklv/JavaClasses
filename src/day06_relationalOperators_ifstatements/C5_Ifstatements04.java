package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C5_Ifstatements04 {

	public static void main(String[] args) {

		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lutfen kenar uzunluklar�ndan birini tam say� olarak giriniz");
		
		int kenar1=scan.nextInt();
		
		System.out.println("Lutfen diger kenar uzunlugunu tam say� olarak giriniz");

		int kenar2=scan.nextInt();
		
		if(kenar1==kenar2) {
			
			System.out.println("Girdi�iniz olculere g�re �ekil karedir");
		}
		
		if(kenar1!=kenar2) {
			
			System.out.println("Girdi�iniz olculere g�re �ekil kare degildir");
		}
	}

}
