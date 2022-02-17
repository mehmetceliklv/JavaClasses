package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C5_Ifstatements04 {

	public static void main(String[] args) {

		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lutfen kenar uzunluklarýndan birini tam sayý olarak giriniz");
		
		int kenar1=scan.nextInt();
		
		System.out.println("Lutfen diger kenar uzunlugunu tam sayý olarak giriniz");

		int kenar2=scan.nextInt();
		
		if(kenar1==kenar2) {
			
			System.out.println("Girdiðiniz olculere göre þekil karedir");
		}
		
		if(kenar1!=kenar2) {
			
			System.out.println("Girdiðiniz olculere göre þekil kare degildir");
		}
	}

}
