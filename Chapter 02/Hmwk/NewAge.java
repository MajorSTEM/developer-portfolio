// This program calculates your age in the year 2050.
// Input:  None.
// Output: Your current age followed by your age in 2050.

public class NewAge
{
   public static void main(String args[])
   {
	
	int currentYear= 2022;
		int currentAge= 26;
		int newAge;
    

      newAge = currentAge + (2050 - currentYear);

      System.out.println("My Current Age is " + currentAge);
      System.out.println("I will be " + newAge + " in 2050.");
		
      System.exit(0);
   }
}
