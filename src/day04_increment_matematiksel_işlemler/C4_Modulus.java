package day04_increment_matematiksel_i�lemler;

public class C4_Modulus {

	public static void main(String[] args) {
		
		//5496 n�n rakamlar toplam�n� bulal�m
		
		int sayi=5496 ;
		int rakamToplami=0 ;
		int rakam =sayi %10; //6 modulus ile birler basama��n� buluruz .
		
		rakamToplami +=rakam ; // 6 Rakamlar toplam� 6 oldu.
		
		sayi/=10; // 549 
		
		
		rakam=sayi%10; //9 modulus ile onlar basama��n� buluruz.
		rakamToplami +=rakam ; //Rakamlar toplam� 6+9 =15
		sayi/=10; //54
	
		rakam=sayi%10; //4 modulus ile y�zler basama��n� buluruz.
		rakamToplami +=rakam ;//Rakamlar toplam� 6+9+4 =19
		sayi/=10; // 5
				
		rakam=sayi%10; //5 modulus ile binler basama��n� buluruz.
		rakamToplami +=rakam ;//rakamlar toplam� 6+9+4+5 =24
		sayi/=10;
		
		System.out.println("Rakamlar toplam�: "+rakamToplami);
		System.out.println("Sayinin son de�eri: "+ sayi);

		
		
		
	}

}
