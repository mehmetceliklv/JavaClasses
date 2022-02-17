package day03_datacasting_increment;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
		
		
		//5. Kullanýcýdan isminive soyismini isteyip aþaðýdaki þekilde yazdýrýn.
		// Ýsminiz :
		//Soyisminiz:
		//Kursumuza baþvurunuz için teþekkür ederiz
		
		Scanner scan =new Scanner(System.in);

		
		System.out.println("Please enter your name and surname,\nPress enter after writing your name ");
		
		String name = scan.nextLine();
		String surname = scan.nextLine();
		
		//syso içinde alt satýra geçmek istiyorsak \n yazarýz
		
		System.out.println("Your name :" + name +"\nYour Surname :" + surname + "\nThanks for applying to our online course!");

		scan.close();
		
	
		
	}

}
