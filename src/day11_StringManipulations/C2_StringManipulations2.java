package day11_StringManipulations;

import java.util.Scanner;

public class C2_StringManipulations2 {

	public static void main(String[] args) {
		/*
	  	Soru 1) Kullanicidan email adresini girmesini isteyin, 
	  	mail @gmail.com iceriyorsa �Email adresiniz kaydedildi�, 
	  	icermiyorsa �Lutfen gmail mail adresinizi giriniz.. � yazdirin 
	 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen email giriniz");
		String mail=scan.next();
		
		if (mail.contains("@gmail.com")){
			System.out.println("Emailiniz kaydedildi");
			
		}else {
			System.out.println("Lutfen gmail mail adresinizi giriniz");
			
		}
		
		scan.close();
		
	}

}