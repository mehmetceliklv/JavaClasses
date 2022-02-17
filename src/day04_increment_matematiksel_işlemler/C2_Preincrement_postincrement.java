package day04_increment_matematiksel_iþlemler;

public class C2_Preincrement_postincrement {

	public static void main(String[] args) {
		
		
		int sayi1=20 ;
		
		int sayi2 =++sayi1; // iki iþlem var . önce sayi1 1 artýrýlýyor. Sayi2 declare ediliyor ve deðer atanýyor.
		
		System.out.println("Preincrement sayi1 :"+ sayi1); //21 
		System.out.println("Preincrement sayi2 :"+ sayi2); //21

		
		sayi2 =sayi1++; // iki iþlem var . önce Sayi2 declare ediliyor ve deðer atanýyor. sonra sayi1 1 artýrýlýyor. 
		
		System.out.println("Post-increment sayi1 :"+ sayi1); //22
		System.out.println("Post-increment sayi2 :"+ sayi2); //21

		
		int sayi3 =10 ;
		System.out.println("Preincrement : " + ++sayi3); //11 önce artýr ,sonra yazdýr.
	
		System.out.println("Post-increment : " + sayi3++);//11 önce yazdýr , sonra artýr. Artýrma kalýcý yapýlýyor.
		
		System.out.println("Post-incrementdan sonra sayi3: " + sayi3);  //12
		
		
	}

}
