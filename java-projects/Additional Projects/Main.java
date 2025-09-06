//Isaiah Smith
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nPlease enter the base value : ");
		double base = sc.nextDouble();
		System.out.print("\nPlease enter the exponent value : ");
		double exponent = sc.nextDouble();
		System.out.print("\nThe value of "+base+" raised to the exponent "+exponent+" is "+Math.pow(base,exponent));
	}
}