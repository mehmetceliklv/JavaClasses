package day03_datacasting_increment;

import java.util.Scanner;

public class C2_Scanner02 {

	public static void main(String[] args) {

		//7.Kullan�c�dan ismini al�p isminin ba� harfni yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		char ilkHarf=scan.next().charAt(0);
		
		System.out.println("First letter of your name : " + ilkHarf) ;
		
		scan.close();
		
	}

}
