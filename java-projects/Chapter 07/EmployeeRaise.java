// EmployeeRaise.java - This program reads employee first 
// and last names and salaries from an input file, 
// calculates a 15% raise, and writes the employee's first 
// and last name and new salary to an output file. 
// Input:  employees.txt.
// Output: newSalary2015.txt

import java.io.*;  // Import class for file input.

public class EmployeeRaise
{
   public static void main(String args[]) throws Exception
   {
		
      String firstName, lastName, salaryString;
      double salary, newSalary;
      final double INCREASE = 1.15;
		
      // Open input file.
      FileReader fr = new FileReader("employees.txt");
      // Create BufferedReader object.
      BufferedReader br = new BufferedReader(fr);

      // Open output file
      FileWriter fw = new FileWriter("newSalary2015.txt");
      PrintWriter pw = new PrintWriter(fw);
	
      // Read records from file and test for EOF.
      while((firstName = br.readLine()) != null)      
      { 
         lastName = br.readLine();
         salaryString = br.readLine();
         salary = Double.parseDouble(salaryString);
         newSalary = salary * INCREASE; 
         pw.println(lastName);
         pw.println(firstName);
         pw.println(newSalary);
         pw.flush();
      }

      br.close(); 
      pw.close();	
      System.exit(0);
   } // End of main() method.
} // End of EmployeeRaise class. 
