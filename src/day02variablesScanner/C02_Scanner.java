package day02variablesScanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {

		//kullan�c�dan iki tamsay� al�p bu say�lar�n toplam ,fark ve  �arp�mlar�n� yazd�r�n.
		
		//kullan�c�dan de�er almak i�in �� ad�m atmal�y�z
		//1.Scanner objesi olu�tural�m.
		
		Scanner scan = new Scanner(System.in);
		
		//2.kullan�c�dan ne istedi�imizi yazd�ral�m.
		
		System.out.println("Please enter two different integers");
		
		//3. next metodunu kullanarak girilen de�erleri al�p , olu�turaca��m�z variables lara atayal�m
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println("Total amount of the integers you entered :" + (sayi1+sayi2));
		
		
		
	}

}
