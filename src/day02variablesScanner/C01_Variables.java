package day02variablesScanner;

public class C01_Variables {

	public static void main(String[] args) {
		
		// Farkl� �� data t�r�nde vaiable olu�turun ve bunlar� yazd�r�n
		
		String kelime = "Merhaba" ; //sat�rdaki kod sonunda mutlaka noktal� virg�l kullan�lmal�d�r
		
		System.out.println(kelime);  //kelimenin variable oldu�unu anlar  ve variable degerini yazd�r�r.
		
		System.out.println("kelime"); //kelime yazd�r�r.
		
		
		
		int sayi=20;
		
		System.out.println(sayi);
		
		//1.yazd�r�rken ba��na a��klama eklemek istersem 
		//girilen sayi: 20
		
		
		
		System.out.println("Girilen sayi : " + sayi);
		
		boolean tatildeMi = true ;
		
		//konsolda bu sene tatile gittiniz mi ? =true
		
		
		System.out.println("Bu sene tatile gittiniz mi ? = " + tatildeMi);
		
		
		
		//2.isim ve soyisim i�in iki variable olu�turun ve bunlar� 
		
		// �sminiz : Mehmet
		//Soyisminiz: Celik
		//�eklinde yazd�r�n
		
		String name="Mehmet";
		String surname="Celik";
		
		System.out.println("�sminiz : "+name);
		System.out.println("Soyisminiz : "+surname);
		
		
		//3.�ki tamsay� data t�r�nde 2 variable olu�turun bunlar�n toplam�n� yazd�r�n 
		
		int sayi1 = 10 ;
		byte sayi2 = 5;
		
		System.out.println(sayi1+ sayi2);
		
		// toplama i�leminin ba��na a��klama yazmak istersek 
		//iki say�n�n toplam� = 15 �eklinde
		
		System.out.println("�ki say�n�n toplam� :"+ (sayi1 +sayi2));
		
		//4. Bir tamsay� ve bir ondal�kl� variable olu�turun ve bunlar�n toplam�n� yazd�r�n.
		
		int sayi3=20;
		double sayi4 =2.3 ;
		
		System.out.println(sayi3+sayi4);
		
		//5. char data t�r�nde variable olu�turun ve yazd�r�n.
		
		char karakter ='!' ;
		
		System.out.println(karakter);
		System.out.println("Girilen Karakter :"+ karakter);
		
		//Bir tamsay� bir de char de�i�ken olu�turun ve bunlar�n toplam�n� yazd�r�n.
		
		int sayi5 = 25;
		char harf ='M';
		
		System.out.println(sayi5 + harf); 
		
		//char data t�r�ndeki de�i�kenler matematiksel i�lemlerde kullan�l�rsa ASCII tablosu devreye girer.
		
		
		
				
		
	}

}
