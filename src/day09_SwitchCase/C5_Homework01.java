package day09_SwitchCase;

import java.util.Scanner;

public class C5_Homework01 {

	public static void main(String[] args) {

		// Soru2 : Kullanicidan kacinci ay oldugunu sorun ve ay ismini yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen kacinci ayda oldugumuzu yaziniz");
		
		int ayNo=scan.nextInt();
		
		switch (ayNo) {
		
		case 1 : 
			System.out.println("Ocak ayi");
			break;
		
		case 2 : 
			System.out.println("Subat ayi");
			break;
		case 3 : 
			System.out.println("Mart ayi");
			break;
		case 4 : 
			System.out.println("Nisan ayi");
			break;
		case 5 : 
			System.out.println("Mayis ayi");
			break;
		case 6 : 
			System.out.println("Haziran ayi");
			break;
		case 7 : 
			System.out.println("Temmuz ayi");
			break;
		case 8 : 
			System.out.println("Agustos ayi");
			break;
		case 9 : 
			System.out.println("Eylul ayi");
			break;
		case 10 : 
			System.out.println("Ekim ayi");
			break;
		case 11 : 
			System.out.println("Kasim ayi");
			break;
		case 12 : 
			System.out.println("Aralik ayi");
			break;
		
		default :
		
			System.out.println("Lutfen gecerli bir ay numarasi giriniz");
			
		}
		scan.close();
	}

}
