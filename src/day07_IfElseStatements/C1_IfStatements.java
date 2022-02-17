package day07_IfElseStatements;

import java.util.Scanner;

public class C1_IfStatements {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Please enter a day");
	
	String weekDay=scan.next().toLowerCase();
	
	int flag=0;
	
	if (weekDay.equals("monday")|| weekDay.equals("tuesday" ) ||weekDay.equals("wednesday" )||
			weekDay.equals("thursday" )|| weekDay.equals("friday" )) {
		System.out.println("the day you enter is working day");
		flag++;
	}
	
	if (weekDay.equals("saturday")|| weekDay.equals("sunday" )) {
		
		System.out.println("the day you enter is weekend ");
		flag++;
	}
	
			// pazar ==> flag=1   2.if body'si calisacak
			// sali ==> flag=1   1.if body'si calisacak
			// pezer ==> flag =0 
			
			
	if (flag==0) {
		System.out.println("Please enter a week day");
	}

}

}