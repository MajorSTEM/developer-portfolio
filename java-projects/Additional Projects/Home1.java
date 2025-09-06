//Isaiah Smith

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Home1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double sellingprice = scan.nextDouble();
		double cost = sellingprice * commission;
		double agent = sellingprice * agentrate;
		final double commission = 4.0;
		final double agentrate = .6;
		
		String name, sellingpriceString;
		
		String string1= "This program asks the user for a name and selling\n"
	+ "amount of a home, and then calculates the cost to sell the home\n"
	+ "and the commission of an individual sales agent.\n" ;
	
	name = JOptionPane.showInputDialog(string1 + "\n Please enter the owner's last name:");
	
	sellingpriceString = JOptionPane.showInputDialog ("Enter the sales price of the home.");
	double val= Double.parseDouble(sellingpriceString);

	
	String string2 = String.format ("The "+ name + "'s  home sold for $ %.6f", sellingprice);
	String string3 = String.format("\n The cost to sell the home was" + cost + "\n The selling or listeing agent earned" + agent);
	
	JOptionPane.showMessageDialog(null, string2+ string3, name + "'s Home Sale", JOptionPane.INFORMATION_MESSAGE);
	
	System.exit(0);
	}
	
}