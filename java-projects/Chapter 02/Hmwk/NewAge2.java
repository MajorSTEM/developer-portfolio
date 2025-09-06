// This program calculates your age in the year 2050.
// Input:  None.
// Output: Your current age followed by your age in 2050.

public class NewAge2
{
   public static void main(String args[])
   {
      int currentAge = 25;
      int newAge;
      int currentYear = 2014;
      int Year = 2050;

      // Edit this statement so that it uses the constant named YEAR.
      newAge = currentAge + (Year - currentYear);

      System.out.println("My Current Age is " + currentAge);
      // Edit this output statement so that is uses the constant named YEAR. 
      System.out.println("I will be " + newAge + Year);

      System.exit(0);
   }
}
