package day07_IfElseStatements;

import java.util.Scanner;

public class C2_Ifelse1 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen diktorgenin kenarlarini giriniz \nIlk kenari yazinca ENTER'a basiniz");

		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Girdiginiz olculere gore sekil karedir");
		}
			else {
				
				System.out.println("Girdiginiz olculere gore sekil kare degildir");
			}
		
	}

}
