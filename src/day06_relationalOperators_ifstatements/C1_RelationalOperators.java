package day06_relationalOperators_ifstatements;

public class C1_RelationalOperators {

	public static void main(String[] args) {
		
		System.out.println(15*3==40);// False
		
		System.out.println(15-3==12); //True

		
		boolean esitMi = 24/2==12;
		
		System.out.println(esitMi);
		
		
		System.out.println(5+2!=7);//false
		System.out.println(5*2!=7);//true
		
		//Conditional Operators
		//Or Operator (Biri dogru olsa sonuc true yazar. �kisi de yanl��sa false yazar. )
		System.out.println(  5+2>8   ||   9<6   ); // False
		System.out.println(  5+2<8   ||   9<6   ); // True
		
		
		// And operator(iki tarafta do�ru oldugu takt�rde true yazar.)
		System.out.println(  5+2<8   &&   9<6   ); // False
		System.out.println(  5+2<8   &&   9>=6  ); // True
		
		
		
		
	}

}
