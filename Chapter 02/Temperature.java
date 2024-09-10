/* Temperature.java - This Java program converts a Fahrenheit 
   temperature to Celsius.
   Input:  Interactive
   Output: Fahrenheit temperature followed by Celsius
   temperature 
*/
import javax.swing.JOptionPane; // Imports JOptionPane class.

public class Temperature
{
	public static void main(String args[])
	{
	     String fahrenheitString;
	     double fahrenheit;
	     double celsius;
	
	     // Get interactive user input.
	     fahrenheitString = JOptionPane.showInputDialog(
		"Enter Fahrenheit temperature: ");
	     // Convert String to double.
             fahrenheit = Double.parseDouble(fahrenheitString);
	     // Calculate celsius.
	     celsius = (fahrenheit - 32.0) * (5.0/9.0);
	     // Output.
	     System.out.println("Fahrenheit temperature:" + 
                                fahrenheit);
	     System.out.println("Celsius temperature:" + celsius);
	     // End program.
	     System.exit(0);
	}
}
	     
