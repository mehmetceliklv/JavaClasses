package day04_increment_matematiksel_iþlemler;

public class C1_IncrementDecrement {

	public static void main(String[] args) {
	
		int sayi1 =10 ;
		int sayi2 =20 ;
		
		sayi1-=5; // sayi1=5
		sayi2+=10; //sayi2=30
		
	System.out.println(sayi2/sayi1); //6
	
		sayi1*=2 ; //sayi1 =10 
		sayi2++;   //sayi2 =31
		
		System.out.println(sayi2/sayi1); // 3 (integer olduðu için kesirli göstermiyor)
		
		
		
		
		sayi1/=2 ; // sayi1=5 
		
		double sayi3 =sayi2/10 ; //sayi3 =3.0 ( sayi2 /10 integerdir .double olduðu için 3.0 olarak yazdý.)
		
		System.out.println(sayi3);
		System.out.println(sayi1*sayi2); // 155
		System.out.println(sayi1*sayi3); //15.0
		
		
		sayi3=(double)sayi2/10; // sayi2 yi önce double çeviriyor.(31.0) 
								//Double'i integer a bölünce büyük olana göre sonuç gösteriyor.
								// sonuç 3.1
		
		System.out.println(sayi3);
		
		
		
		System.out.println(sayi2);  // 31
		System.out.println((double)sayi2); // baþýna double yazmakla sayi2 ye atama yapmadýk.
											//geçici olarak sayi2 nin double karþýlýðýný aldýk. (31.0)
		
		
		System.out.println(sayi2); //sayi2 ayný(31)
	
		

	}

}
