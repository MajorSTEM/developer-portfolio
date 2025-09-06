// LargeSmall.java - This program calculates the largest and smallest of three integer values. 


public class LargeSmall 
{
	public static void main(String args[])
	{
		// This is the work done in the housekeeping() method
		// Declare and initialize variables here.
		int largest;		// Largest of the three values.
		int smallest;		// Smallest of the three values.
		int a = -50;
        int b = 26;
		int c = 78;
		
		// This is the work done in the detailLoop() method
		
		//Write assignment, if, or if else statements here as appropriate.	
	if( a < b) {
		smallest=a;
		largest = c;
	} else {
		largest =  a;
		smallest = b;
	}
		if (c>largest){
			largest = c;
		} else if (c < smallest)  {
			smallest=c;
		}
			
		// This is the work done in the endOfJob() method	
		// Output largest and smallest number. 
		System.out.println("The largest value is " + largest);
		System.out.println("The smallest value is " + smallest);
	}
} 	
