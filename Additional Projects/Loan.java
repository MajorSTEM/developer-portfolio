//This program is written by Samantha Gorton, Milene Hurtado, Leslie Perez, Isaiah Smith, Jacob Meiss
import java.util.Scanner;
public class Loan
{
static Scanner console = new Scanner(System.in);
public static void main(String[] args)
{
	//the user is prompted to enter their loan amount
System.out.println("Please enter your loan amount: ");
double principal = console.nextDouble();
System.out.println();
//the user is prompted to enter their interest percentage rate//
System.out.println("Please enter the interest percent to your loan: ");
double percentage=console.nextDouble();
System.out.println();
//the user is shown what their monthly payment must be more than//
System.out.printf("Monthly payment must be more than: %.2f",(principal * (percentage/12/100)));
System.out.println();
//the user is prompted to enter their monthly payment here//
System.out.print("Please enter monthly payment: ");
double monthlyPayment=console.nextDouble();
System.out.println();
//the number of months to pay the loan is declared here//
int numberOfMonths=0;
//a loop is used shown the loan amount needed to be more than zero//
//tht total remaining amount will be shown here in a loop//
while (principal>=0)
{
	if(principal<monthlyPayment)
	{
		System.out.printf("Total remaining amount to be paid:%.2f",(principal+principal*(percentage/12/100)));
		numberOfMonths++;
		break;
	}
	//the number of monnths to repay the loan will be output here//
	double interest = principal * percentage/12/100;
	System.out.println("Number of months to repay the loan:" +numberOfMonths);
	break;
}
}
}
