//Isaiah Smith

import java.util.Scanner;
import java.text.DecimalFormat;

public class Home2
{
public static void main (String [] args)
{
	DecimalFormat pricePattern = new DecimalFormat("$#,###.00");
	
	Scanner scan = new Scanner(System.in);
	double price = scan.nextDouble();
	final double commission = 4.0;
	final double agentrate = .6;
	double cost = price * commission;
	double agent = price * agentrate;
	
	System.out.println("This program calculates the cost to sell a home and the commission" +
	"\npaid to an individual sales agent.");
	
	System.out.println("\nThe user is asked for the last name of the seller and the sales price.");
	System.out.print("\nPlease enter the owner's last name > ");
	String name = scan.next();
	
	System.out.print("Please enter the sales price > ");
	System.out.println("\nThe " + name + "'s home sold for " + pricePattern.format(price));
	System.out.println("The cost to sell the home was " + pricePattern.format(cost));
	System.out.println("The selling or listing agent earned " + pricePattern.format(agent));

}
}

