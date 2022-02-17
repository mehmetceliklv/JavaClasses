package day07_IfElseStatements;

import java.util.Scanner;

public class C4_Ifelse3 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen yasinizi giriniz");
		
		int girilenyas =scan.nextInt();
		
		if (girilenyas<=65) {
			
			System.out.println("Emekli olamazsýn ,calismalisin");
			
		}
		
		else {
			
			System.out.println("Emekli olabilirsin");
		}
			
	}

}
