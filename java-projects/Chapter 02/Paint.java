// Calculates the number of gallons of paint needed. 
public class Paint
{
	public static void main(String args[])
	{
	   double height1 = 9;
	   double height2 = 9;
	   int width1 = 19.5;
	   double width2 = 20.0;
	   double squareFeet;	   
	   int numGallons;
	   numGallons = squareFeet / 150;
	   squareFeet = (width1 * height1 + width2 * height2) * 2;
	   System.out.println("Number of Gallons: " + numGallons);
	   System.exit(0);
	}
}
