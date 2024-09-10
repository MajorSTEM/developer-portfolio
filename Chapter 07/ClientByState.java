// ClientByState.java - This program creates a report that lists
// clients with a count of the number of clients for each state. 
// Input:  client.dat
// Output:  Report

import java.io.*; 

public class ClientByState
{
	public static void main(String args[]) throws Exception
	{
		// Declarations
		FileReader fr = new FileReader("client.dat");
		BufferedReader br = new BufferedReader(fr);  
		final String TITLE = "\n\nCompany Clients by State of Residence\n\n";    	
		String name = "", city = "", state = "";
		int count = 0; 
   		String oldState = "";
		boolean done; 
								
		// This is the work done in the getReady() method		
		System.out.println(TITLE);
		if((name = br.readLine()) != null)
		{
		 	city = br.readLine();
			state = br.readLine();
			done = false;
			oldState = state;
		}
		else
			done = true; 
		while(done == false)
		{
			// This is the work done in the produceReport() method
			if(state.compareTo(oldState) != 0)
			{
				// This is the work done in the controlBreak() method
				System.out.println("\t\t\tCount for " + oldState + " " + count);
				count = 0;
				oldState = state;
			}
			System.out.println(name + " " + city + " " + state);
			count++;
			if((name = br.readLine()) != null)
			{
		 		city = br.readLine();
				state = br.readLine();
				done = false;
			}
			else
				done = true; 
		}
		// This is the work done in the finishUp() method		
		System.out.println("\t\t\tCount for " + oldState + " " + count);
		br.close();
			
		System.exit(0);

	} // End of main() method.
} // End of ClientByState class.

