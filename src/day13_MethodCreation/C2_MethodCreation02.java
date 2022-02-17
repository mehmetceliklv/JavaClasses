package day13_MethodCreation;

import java.util.Scanner;

public class C2_MethodCreation02 {

	public static void main(String[] args) {
				// Kullanicidan 2 tamsayi isteyin
				// bu sayilarin toplamlarini ve carpimlarini 
				// iki ayri method'da hesaplayip yazdirin
				
				
				
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen iki tamsayi giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		// method olusturmanin kolay yolu
		// method ismini ve parametreleri yazin (method call)
		
		toplama(sayi1,sayi2);
		
		carpma(sayi1,sayi2);
		carpma(sayi1+3,sayi2*2);
		
		toplama(sayi1+3,sayi2+1);
		
		sayi1=20;
		sayi2=15;
		
		toplama(sayi1,sayi2);
		carpma(sayi1,sayi2);
		
		sayi2=40;
		toplama(sayi1,sayi2);
		
		// Sonuc olarak uygulamanizda tekrar tekrar kullanmaniz gereken kod bloklari icin
		// her seferinde yeniden yazmak yerine , bu blogu bir method'da yazip
		// ihtiyacimiz oldugu her seferde cagirmak daha mantiklidir.
		
		scan.close();
		
	}
		// Bir method sadece konsolda birseyler yazdiracaksa return type olarak void yazilir
		// bu durumda return keyword'une ihtiyac olmaz
		// ve METHOD BIZE BIR SONUC DONDURMEZ
	
	public static void carpma(int sayi1, int sayi2) {
		System.out.println("Girilen sayilarin carpimi : "+ (sayi1*sayi2));
		
	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("Girilen sayilarin toplami : "+(sayi1+sayi2));
		
	}

}
