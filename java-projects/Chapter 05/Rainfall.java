// Rainfall.java - This program finds the average rainfall for a week.  
// Input:  Rainfall, in inches, for each day of one week.
// Output: Prints the seven rainfall amounts and their average. 

import javax.swing.JOptionPane;

public class Rainfall
{
	public static void main(String args[])
	{
		
		String stringRain; 	// String version of rainfall amount.
		double rainfall;	// Daily rainfall amount. 
		double sum = 0; 	// Accumulates sum of seven rainfall amounts.
		double average; 	// Average of seven rainfall amounts.
		int counter; 		// Loop control variable.
		final int DAYS_IN_WEEK = 7; // Constant number of days in a week.
		
		// This is the work done in the detailLoop() method
		// Loop for seven days.
		for(counter = 1; counter <= DAYS_IN_WEEK; counter++)
		{
			stringRain = JOptionPane.showInputDialog(
                           "Enter rainfall amount for Day " + counter);
			rainfall = Double.parseDouble(stringRain);
			System.out.println("Day " + counter + " rainfall amount is " + rainfall + " inches");
			sum += rainfall;
		}	
		
		// Calculate average.
		average = sum / DAYS_IN_WEEK;
		
		// This is the work done in the endOfJob() method
		// Output average.	
		System.out.println("Average Rainfall amount is " + average);
		System.exit(0); 
	} // End of main() method.

} // End of Rainfall class. 

