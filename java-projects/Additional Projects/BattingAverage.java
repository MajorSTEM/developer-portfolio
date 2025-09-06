import javax.swing.*;
public class BattingAverage
{
	public static void main(String args[])
	{
		// Declare a named constant for array size here.
		
int size=8;
		// Declare array here.
		double averages[]= new double [size];

		// Use this integer variable as your loop index.
		int loopIndex; 

		// Use this variable to store the batting average input by user.
		double battingAverage;

		// String version of batting average input by user.
		String averageString; 

		// Use these variables to store the minimim and maximum batting averages.
		double min, max;

		// Use these variables to store the total and the average.
		double total, average; 

		// Write a loop to get batting averages from user and assign to array.
		for(loopIndex=0;loopIndex<size;loopIndex++)
		{
		   averageString = JOptionPane.showInputDialog("Enter a batting average: ");
		   battingAverage = Double.parseDouble(averageString);
		   averages[loopIndex]=battingAverage;
		}
		   // Assign value to array.
		   
		
		// Assign the first element in the array to be the minimum and the maximum.
		min = averages[0];
		max = averages[0];
		// Start out your total with the value of the first element in the array.
		total = averages[0]; 
		// Write a loop here to access array values starting with averages[1]
		for(loopIndex=1;loopIndex<size;loopIndex++)
		{
			total+=averages[loopIndex];
			if(averages[loopIndex]>max)
				max=averages[loopIndex];
			if(averages[loopIndex]<min)
				min=averages[loopIndex];
		}
		
		   // Within the loop test for minimum and maximum batting averages.
		   
		   // Also accumulate a total of all batting averages.
		   average=total/size;
		
		   
		// Calculate the average of the 8 averages.
		System.out.println("Here are the averages");

		// Print the averages stored in the averages array. 
		for (loopIndex=0;loopIndex<size;loopIndex++)
			System.out.println(averages[loopIndex]);
		
		// Print the maximum batting average, minimum batting average, and average batting average. 
	System.out.println("Here's the max batting average" +max);
	System.out.println("Here's the minimum batting average" +min);
	System.out.println("Here's the average batting average" +average);
		
		System.exit(0);

	}
}

