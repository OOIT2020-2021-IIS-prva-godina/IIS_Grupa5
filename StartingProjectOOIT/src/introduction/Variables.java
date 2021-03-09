package introduction;

public class Variables {

	public static void main(String[] args) { 
		
		//deklaracija promenljive - double
		double firstNumber;
		//inicijalizacija promenljive
		firstNumber = 1;
		double secondNumber = 5;
		
		double doubleResult = firstNumber / secondNumber;
		System.out.println(doubleResult);
		
		//da bi rezultat bio tipa int, moramo izvrsiti EKSPLICITNU konverziju
		int result = (int)(firstNumber / secondNumber);
		System.out.println(result);
		
		//logicki tip podataka
		boolean alwaysTrue = true;
		boolean secondBoolean = false;
		//konjunkcija - logicki operator AND
		System.out.println(alwaysTrue && secondBoolean); // Rezultat: false
		//disjunkcija - logicki operator OR
		System.out.println(alwaysTrue || secondBoolean);  //Rezultat: true
		//negacija
		System.out.println(!alwaysTrue);	//Rezultat: false
		System.out.println(!secondBoolean); //Rezultat: true
		
		//konkatenacija (spajanje) stringova
		String name = "Petar";
		String lastName = "Petrovic";
		System.out.println(name + " " + lastName + " Njegos");
		
		//IF - ELSE IF - ELSE blok
		if (firstNumber > 0)
			System.out.println("Number is positive.");	
		else if (firstNumber < 0)
			System.out.println("Number is negative.");
		else 
			System.out.println("Number is equal to zero.");
		
		//WHILE
		//Ispisati brojeve od 1 do 10
		int i = 1;
		while (i<11) { 
			System.out.println(i);
			i++;
		}
		/* DRUGI nacin 
		i=0;
		 
		while (i<10) {
			i++;
			System.out.println(i);
			
		}
		*/
		
		//1. zadatak 
		int numOne = 24;
		int numTwo = 12;
		char operation = '*';
		int resultOperation;
		
		if (operation == '+')
			resultOperation = numOne + numTwo;
		else if (operation == '-')
			resultOperation = numOne - numTwo;
		else if( operation == '*')
			resultOperation = numOne * numTwo;
		else 
			resultOperation = numOne/ numTwo;
		System.out.println("Result of operation: " + operation + " is: " + resultOperation);
		
		//2. zadatak
		// faktorijel broja 5 -> 5*4*3*2*1
		i = 5;
		int factorial = 1;
		while (i>0) {
			factorial = factorial * i;
			// factorial *= i;
			i--;
		}
		System.out.println("(while) " + "5!= " + factorial);
		
		//DO WHILE (2. nacin)
		i=5;
		factorial = 1;
		do {
			factorial = factorial * i;
			i--;
		}while (i>0);
		System.out.println("(do while) " + "5!= " + factorial);
		
		//3. zadatak
		for(i = 1; i <= 10; i++) {
			if(i % 2 != 0)
				System.out.println(i);
		}
		
		//3. zadatak - 2.nacin
		for(i = 1; i <= 10; i++) {
			if(i % 2 == 0)
				continue; // nastavlja se for petlja
				//break; //zavrsava se for petlja kada udje u if
			System.out.println(i);
		}
		
	}
}
