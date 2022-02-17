package day01variables;

import java.util.Scanner;

public class C01_Variables02 {

	
	public static void main(String[] args) {
		
		
		// kullanýcýdan bilgi almak için 3 adýma ihtiyacýmýz var
		// Scanner class ýndan bir object olusturuyoruz
		
		Scanner scan = new Scanner(System.in);
				
		//kullanýcýya ne istediðinizi bidiren bir mesaj yazýn 
				
		System.out.println("Lütfen isminizi yazýn");	
		
		//kullanýcýdan istediðmiz data türüne göre bir variable olusturup 
		//konsolda yazýlan bilgiyi kodlarýmýzýn içine alýyoruz 
		
		
		String kullanicininIsmi = scan.nextLine();
		
		System.out.println("Girdiðiniz isim : " + kullanicininIsmi);
		
		scan.close();
		
	}

}
 