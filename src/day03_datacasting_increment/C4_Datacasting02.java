package day03_datacasting_increment;

public class C4_Datacasting02 {

	public static void main(String[] args) {

		double sayi1 = 200.18 ;
	
		int sayi2 = (int) sayi1 ;
		
		System.out.println("int deðiþken ile : " + sayi2 );
		
		//explicit narrowing data casting yapilirken data kayiplari olabilir.
		
		byte sayi3 = (byte) sayi1;
		
		System.out.println("byte degisken ile : " + sayi3);
		//hatta daha küçük data türüne uymasý için deðiþtirilebilir.
		
		
		
		
		int sayi4 = 95 ;
		int sayi5 = 10 ;
		
		System.out.println("Bolme islemi sonucu : "+ sayi4 /sayi5);
		
		//Bolunen sayý ve bolen sayý ýkýsýde ýnt ise , java sonucu ýnt verir.
		
		double sayi6 = 2000 ;
		
		System.out.println(sayi6/sayi5);
		
		
		
		double sayi7 =5;
		
		System.out.println(sayi4/sayi7);
		
		
		
		
		 
		
	}

}
