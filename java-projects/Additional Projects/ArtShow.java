// ArtShow.java - This program determines if an art show attendee gets a 5% discount
// for preregistering. 
// Input:  Interactive.
// Output:  A statement telling the user if they get a discount or no discount. 

import javax.swing.*;

public class ArtShow
{
	public static void main(String args[]) 
	{
		             	
		String registerString;	
						
		registerString = JOptionPane.showInputDialog("Did you preregister? Enter Y or N: ");
				
		// Test input here. If Y, call discount(), else call noDiscount(). 
		if (registerString.equalsIgnoreCase("Y"))
			discount();
		else
			noDiscount();
		
	
		System.exit(0);

	} // End of main() method.
	
	
	// Write discount method here.
	private static void discount() {
	JOptionPane.showMessageDialog(null, "Since you have preregisted you qualify for a 5% discount!");
	}
	


	// Write noDiscount method here. 
	private static void noDiscount() {
	JOptionPane.showMessageDialog(null, "Unfortunately, you do not qualify for the discount since you did not preregister; we apologize for the inconvenience.");
	}

} // End of ArtShow class.

