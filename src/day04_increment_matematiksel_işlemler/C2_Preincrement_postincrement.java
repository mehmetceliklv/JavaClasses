package day04_increment_matematiksel_i�lemler;

public class C2_Preincrement_postincrement {

	public static void main(String[] args) {
		
		
		int sayi1=20 ;
		
		int sayi2 =++sayi1; // iki i�lem var . �nce sayi1 1 art�r�l�yor. Sayi2 declare ediliyor ve de�er atan�yor.
		
		System.out.println("Preincrement sayi1 :"+ sayi1); //21 
		System.out.println("Preincrement sayi2 :"+ sayi2); //21

		
		sayi2 =sayi1++; // iki i�lem var . �nce Sayi2 declare ediliyor ve de�er atan�yor. sonra sayi1 1 art�r�l�yor. 
		
		System.out.println("Post-increment sayi1 :"+ sayi1); //22
		System.out.println("Post-increment sayi2 :"+ sayi2); //21

		
		int sayi3 =10 ;
		System.out.println("Preincrement : " + ++sayi3); //11 �nce art�r ,sonra yazd�r.
	
		System.out.println("Post-increment : " + sayi3++);//11 �nce yazd�r , sonra art�r. Art�rma kal�c� yap�l�yor.
		
		System.out.println("Post-incrementdan sonra sayi3: " + sayi3);  //12
		
		
	}

}
