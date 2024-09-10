//Isaiah Smith


package power1;

import java.util.*;
import java.lang.*;

public class Power1 {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int base, exponent, power;
		
		System.out.println("This porgram asks the user for two values");
		System.out.println("The first value will be used a base number");
		System.out.println("The second vaule will be used as an exponent");
		System.out.println("The program calculates the value of teh base number raised to the exponent number");
		
		System.out.println("Please enter the base value");
		base = console.nextInt();
		
		System.out.println("Please enter the exponent values");
		exponent = console.nextInt();
		
		System.out.println("The value of " + base + " raised to the exponent of "+ exponent+ " is: "  +Math.pow(base,exponent));
	}
}



// This porgram asks the user for two values 
// The first value will be used a base number
// The second vaule will be used as an exponent
// The program calculates the value of teh base number raised to the exponent number
// Please enter the base value 4
// Please enter the exponent values 3
// The value of 4 raised to the exponent of 3 is: 64.0
