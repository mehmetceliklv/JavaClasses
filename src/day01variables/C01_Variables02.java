package day01variables;

import java.util.Scanner;

public class C01_Variables02 {

	
	public static void main(String[] args) {
		
		
		// kullan�c�dan bilgi almak i�in 3 ad�ma ihtiyac�m�z var
		// Scanner class �ndan bir object olusturuyoruz
		
		Scanner scan = new Scanner(System.in);
				
		//kullan�c�ya ne istedi�inizi bidiren bir mesaj yaz�n 
				
		System.out.println("L�tfen isminizi yaz�n");	
		
		//kullan�c�dan istedi�miz data t�r�ne g�re bir variable olusturup 
		//konsolda yaz�lan bilgiyi kodlar�m�z�n i�ine al�yoruz 
		
		
		String kullanicininIsmi = scan.nextLine();
		
		System.out.println("Girdi�iniz isim : " + kullanicininIsmi);
		
		scan.close();
		
	}

}
 