package day02variablesScanner;

import java.util.Scanner;

public class C03_Scanner02 {

	public static void main(String[] args) {
	//Kullanýcýdan ismini ve soyismini alýp 
	//Aralarýnda bir boþul oluþturarak aþaðýdaki þekilde yazdýrýn
	// Isim - Soyisim : Mehmet Celik
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Please enter your name ");
		
		String name =scan.next();
		
		System.out.println("Please enter your surname");
		
		String surname =scan.next();
		
		System.out.println("Name - Surname :" + (name +" "+ surname));
				

	}

}
