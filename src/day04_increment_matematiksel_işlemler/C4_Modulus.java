package day04_increment_matematiksel_iþlemler;

public class C4_Modulus {

	public static void main(String[] args) {
		
		//5496 nýn rakamlar toplamýný bulalým
		
		int sayi=5496 ;
		int rakamToplami=0 ;
		int rakam =sayi %10; //6 modulus ile birler basamaðýný buluruz .
		
		rakamToplami +=rakam ; // 6 Rakamlar toplamý 6 oldu.
		
		sayi/=10; // 549 
		
		
		rakam=sayi%10; //9 modulus ile onlar basamaðýný buluruz.
		rakamToplami +=rakam ; //Rakamlar toplamý 6+9 =15
		sayi/=10; //54
	
		rakam=sayi%10; //4 modulus ile yüzler basamaðýný buluruz.
		rakamToplami +=rakam ;//Rakamlar toplamý 6+9+4 =19
		sayi/=10; // 5
				
		rakam=sayi%10; //5 modulus ile binler basamaðýný buluruz.
		rakamToplami +=rakam ;//rakamlar toplamý 6+9+4+5 =24
		sayi/=10;
		
		System.out.println("Rakamlar toplamý: "+rakamToplami);
		System.out.println("Sayinin son deðeri: "+ sayi);

		
		
		
	}

}
