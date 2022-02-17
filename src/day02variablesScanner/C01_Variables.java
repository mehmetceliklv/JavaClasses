package day02variablesScanner;

public class C01_Variables {

	public static void main(String[] args) {
		
		// Farklý üç data türünde vaiable oluþturun ve bunlarý yazdýrýn
		
		String kelime = "Merhaba" ; //satýrdaki kod sonunda mutlaka noktalý virgül kullanýlmalýdýr
		
		System.out.println(kelime);  //kelimenin variable olduðunu anlar  ve variable degerini yazdýrýr.
		
		System.out.println("kelime"); //kelime yazdýrýr.
		
		
		
		int sayi=20;
		
		System.out.println(sayi);
		
		//1.yazdýrýrken baþýna açýklama eklemek istersem 
		//girilen sayi: 20
		
		
		
		System.out.println("Girilen sayi : " + sayi);
		
		boolean tatildeMi = true ;
		
		//konsolda bu sene tatile gittiniz mi ? =true
		
		
		System.out.println("Bu sene tatile gittiniz mi ? = " + tatildeMi);
		
		
		
		//2.isim ve soyisim için iki variable oluþturun ve bunlarý 
		
		// Ýsminiz : Mehmet
		//Soyisminiz: Celik
		//þeklinde yazdýrýn
		
		String name="Mehmet";
		String surname="Celik";
		
		System.out.println("Ýsminiz : "+name);
		System.out.println("Soyisminiz : "+surname);
		
		
		//3.Ýki tamsayý data türünde 2 variable oluþturun bunlarýn toplamýný yazdýrýn 
		
		int sayi1 = 10 ;
		byte sayi2 = 5;
		
		System.out.println(sayi1+ sayi2);
		
		// toplama iþleminin baþýna açýklama yazmak istersek 
		//iki sayýnýn toplamý = 15 þeklinde
		
		System.out.println("Ýki sayýnýn toplamý :"+ (sayi1 +sayi2));
		
		//4. Bir tamsayý ve bir ondalýklý variable oluþturun ve bunlarýn toplamýný yazdýrýn.
		
		int sayi3=20;
		double sayi4 =2.3 ;
		
		System.out.println(sayi3+sayi4);
		
		//5. char data türünde variable oluþturun ve yazdýrýn.
		
		char karakter ='!' ;
		
		System.out.println(karakter);
		System.out.println("Girilen Karakter :"+ karakter);
		
		//Bir tamsayý bir de char deðiþken oluþturun ve bunlarýn toplamýný yazdýrýn.
		
		int sayi5 = 25;
		char harf ='M';
		
		System.out.println(sayi5 + harf); 
		
		//char data türündeki deðiþkenler matematiksel iþlemlerde kullanýlýrsa ASCII tablosu devreye girer.
		
		
		
				
		
	}

}
