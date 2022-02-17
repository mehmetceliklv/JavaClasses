package day12_StringManipulations;

import java.util.Scanner;

public class C2_StringManipulations2 {

	public static void main(String[] args) {
		/*
		 Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin 
		 ve asagidaki gibi yazdirin
		isim-soyisim : M***** B*******
		kart no : **** **** **** 1234
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen adinizi giriniz");
		String name=scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen soyadinizi giriniz");
		String surname=scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen kart numaranizi giriniz");
		String kkno=scan.nextLine();
		
		String isimDuzenlenmis =name.substring(0,1).toUpperCase()+// Bas harfi buyuk olarak verir.
									name.substring(1).replaceAll("\\w","*"); // ilk harften 
		                                                    // sonraki tum harfleri *'a cevirir
		String soyisimDuzenlenmis= surname.substring(0,1).toUpperCase()+
									surname.substring(1).replaceAll("\\S","*");

		String kkNoDuzenlenmis= "**** **** **** " + kkno.substring(15);
		
		System.out.println("Isim-Soyisim :" +isimDuzenlenmis+" "+soyisimDuzenlenmis
											+"\nkart no :" + kkNoDuzenlenmis );
											
		scan.close();
		
	}

}
