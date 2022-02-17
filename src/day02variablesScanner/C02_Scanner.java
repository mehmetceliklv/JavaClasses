package day02variablesScanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {

		//kullanýcýdan iki tamsayý alýp bu sayýlarýn toplam ,fark ve  çarpýmlarýný yazdýrýn.
		
		//kullanýcýdan deðer almak için üç adým atmalýyýz
		//1.Scanner objesi oluþturalým.
		
		Scanner scan = new Scanner(System.in);
		
		//2.kullanýcýdan ne istediðimizi yazdýralým.
		
		System.out.println("Please enter two different integers");
		
		//3. next metodunu kullanarak girilen deðerleri alýp , oluþturacaðýmýz variables lara atayalým
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println("Total amount of the integers you entered :" + (sayi1+sayi2));
		
		
		
	}

}
