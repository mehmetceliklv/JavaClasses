package day04_increment_matematiksel_iþlemler;

public class C3_Predecrement_Postdecrement {

	public static void main(String[] args) {

		
		int sayi1= 20;
		int sayi2=sayi1-- ;
		
		System.out.println("Post-decremant sayi1 :"+ sayi1); //19
		System.out.println("Post-decremant sayi2 :"+ sayi2); //20

		
		System.out.println(--sayi2); //19 Önce azalt ,sonra yazdýr
		System.out.println(sayi2--); //19 önce yazdýr , sonra azalt
		
		System.out.println(sayi2);   //18
		
		
	}

}
