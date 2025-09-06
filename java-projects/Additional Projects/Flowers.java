// Flowers.java - This program reads names of flowers and whether they are grown in shade or sun from an input 
// file and prints the information to the user's screen. 
// Input:  flowers.dat.
// Output: Names of flowers and the words sun or shade.

import java.io.*;  // Import class for file input.

public class Flowers
{
	public static void main(String args[]) throws Exception
	{
		// Declare variables here
		String flowername= "";
		String sunorshade= "";
		// Open input file.
		FileReader from = new FileReader("flowers.dat");
	
		
		// Create BufferedReader object.
			BufferedReader br = new BufferedReader (from);
	
		// Write while loop that reads records from file.
		while((flowername = br.readLine()) !=null)
		{ 
	sunorshade =br.readLine();
		
                        // Print flower name and the words sun or shade.
						System.out.println(flowername+ " is a type of flower that grows in the " + sunorshade);
		}
			

		br.close(); 	
		System.exit(0);
	} // End of main() method.

} // End of Flowers class. 

