package day09_SwitchCase;

import java.util.Scanner;

public class C3_SwitchCase03 {

	public static void main(String[] args) {
		/*
		 Soru5 : Kullanicidan gun ismini alip haftaici 
		 veya hafta sonu yazdiralim
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen gun ismi giriniz");
		
		String gunIsmi = scan.next().toLowerCase() ;
		
		switch (gunIsmi) {
		
		case "pazartesi":
		case "sali" 	:
		case "carsamba" :
		case "persembe" :
		case "cuma" 	:	
		  
			System.out.println("Girdiginiz gun hafta icidir");
			break;
		case "cumartesi":
		case "pazar"	:
			System.out.println("Girdiginiz gun haftasonu");
			break;
		default:
			System.out.println("Lutfen gecerli bir gun giriniz");
		
		
		}
		scan.close();
	}

}
