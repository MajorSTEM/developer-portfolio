// MovieGuide.java - This program allows each theater patron to enter a value from 0 to 4 
// indicating the number of stars that the patron awards to the Guide's featured movie of the 
// week. The program executes continuously until the theater manager enters a negative number to 
// quit. At the end of the program, the average star rating for the movie is displayed.  

import javax.swing.JOptionPane;

public class MovieGuide 
{
	public static void main(String args[])
	{
                
		// Declare and initialize variables.
		double numStars;         // star rating.
		String numStarsString; 	 // string version of star rating
		double averageStars;  	 // average star rating.
		double totalStars = 0; 	 // total of star ratings.
		int numPatrons = 0;      // keep track of number of patrons
		
			
	
		// This is the work done in the housekeeping() method
		// Get input.
		numStarsString = JOptionPane.showInputDialog ("Please enter a star rating betwen 1 &4:");
	
		
				
                // This is the work done in the detailLoop() method
		// Convert to double.
		numStars=Double.parseDouble (numStarsString);
		
		// Write while loop here
		while (numStars >=1 && numStars <=4)
		{
		numStars =Double.parseDouble (numStarsString);
		totalStars += numStars;
		System.out.println ("Enter the number of patrons to respond: " +numPatrons);
		numPatrons ++;
		System.out.println ("Number of stars that were given:" +numStars);
		averageStars = (totalStars/numPatrons);
		System.out.print (" Please enter a star rating between 1 & 4:");
		}
		if (totalStars == -2)
		
			
                // This is the work done in the endOfJob() method
		// Calculate average star rating
		{
			averageStars = (totalStars+1)/numPatrons;
			System.out.println ("Average star value:" + averageStars);
		}

		
		System.exit(0);
	} // End of main() method.

} // End of MovieGuide class.

