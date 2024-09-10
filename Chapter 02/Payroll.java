// This program calculates an employee's take home pay. 
public class Payroll
{
	public static void main(String args[])
	{
		double salary = 1250.00;
		double stateTax;
		double federalTax;
		double numDependents = 2;
		double dependentDeduction;
		double totalWithholding;
		double takeHomePay;

		// Calculate state tax here.

		System.out.println("State Tax: $" + stateTax);
		// Calculate federal tax here. 

		System.out.println("Federal Tax: $" + federalTax);
		// Calculate dependant deduction here.

		System.out.println("Dependents: $" + dependentDeduction);
		// Calculate total withholding here.

		// Calculate take home pay here.

		System.out.println("Salary: $" + salary);
		System.out.println("Take Home Pay: $" + takeHomePay);
		System.exit(0);
	}
}
