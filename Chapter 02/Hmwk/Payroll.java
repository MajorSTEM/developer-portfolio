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
		stateTax = salary * 6.5/100;

		System.out.println("State Tax: $" + stateTax);
		// Calculate federal tax here. 
		federalTax = salary * 28/100;

		System.out.println("Federal Tax: $" + federalTax);
		// Calculate dependant deduction here.
		dependentDeduction = salary * (numDependents*2.5/100);

		System.out.println("Dependents: $" + dependentDeduction);
		// Calculate total withholding here.
		totalWithholding = stateTax + federalTax;

		// Calculate take home pay here.
		takeHomePay = salary - totalWithholding + dependentDeduction;

		System.out.println("Salary: $" + salary);
		System.out.println("Take Home Pay: $" + takeHomePay);
		System.exit(0);
	}
}
