package day03_datacasting_increment;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
		
		
		//5. Kullan�c�dan isminive soyismini isteyip a�a��daki �ekilde yazd�r�n.
		// �sminiz :
		//Soyisminiz:
		//Kursumuza ba�vurunuz i�in te�ekk�r ederiz
		
		Scanner scan =new Scanner(System.in);

		
		System.out.println("Please enter your name and surname,\nPress enter after writing your name ");
		
		String name = scan.nextLine();
		String surname = scan.nextLine();
		
		//syso i�inde alt sat�ra ge�mek istiyorsak \n yazar�z
		
		System.out.println("Your name :" + name +"\nYour Surname :" + surname + "\nThanks for applying to our online course!");

		scan.close();
		
	
		
	}

}
