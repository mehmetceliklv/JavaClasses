package day05_Wrapper_Cocatenation;

public class C1_WrapperClass {

	public static void main(String[] args) {

		String name="Mehmet";
		int number =10;
		
		System.out.println(name.charAt(2));
		
		// isim. dedigimizde bircok method listeleniyor, cunku isim variable'inin data turu String
		// ve String non-primitive dir.
		// non-primitive deger'in yaninda method'lar vardir
		// sayi. sayi variable'inin data turu int
		// ve int primitive dir
		// primitive data turleri sadece value'ya sahiptirler method'lari yoktur.
		
		
		// Java primitive data turleri icin de method'larin kullanilabilmesi icin
		// her primitive data turu icin bir WRAPPER CLASS olusturmus
		
		Integer sayi2=10;
		System.out.println(sayi2.MAX_VALUE);
		System.out.println(sayi2.MIN_VALUE);
		
		Short sayi3=0;
		
		System.out.println(sayi3.MAX_VALUE);
		System.out.println(sayi3.MIN_VALUE);
		
		
		
		
		//Wrapper Class a ornek verelim.
		
		String okulNo="858" ;
		
		//Eger string bir variable sadece sayýlardan olusuyorsa , bu string i integer a cevirebiliriz .
		
		int okulNoSayiOlarak= Integer.parseInt(okulNo);
		
		System.out.println(++okulNoSayiOlarak);
		
		Character basHarf='a' ;
				
		System.out.println(basHarf.charValue());
		System.out.println(Character.toUpperCase('a'));
		
		
		
		
		
	}

}
