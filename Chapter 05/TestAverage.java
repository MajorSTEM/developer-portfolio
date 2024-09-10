// This program calculates an average test score given individual test scores.
// Input:  Interactive - Student Test Scores.
// Output: Number of Students taking the test and the test score average.

import javax.swing.JOptionPane;

public class TestAverage
{
	public static void main(String args[])
	{
		// Declare variables.
		String stringScore;
		String stringNum;
		int testScore;
		int numStudents;
		int stuCount;
		double testTotal;
		double average;
		
		// This is the work done in the housekeeping() method
                // Get user input to control loop.
		stringNum = JOptionPane.showInputDialog(
                            "Enter number of students: ");
		
		// Convert number string to integer.
		numStudents = Integer.parseInt(stringNum);
		
		// Initialize accumulator variable to 0.
		testTotal = 0;

		// This is the work done in the detailLoop() method
		// Loop for each student.
		for(stuCount = 0; stuCount < numStudents; stuCount++)
		{
			// Input student test score.
			stringScore = JOptionPane.showInputDialog(
                                      "Enter student's score: ");
			// Convert to integer.
			testScore = Integer.parseInt(stringScore);
			// Accumulate total of test scores.
			testTotal += testScore;
		}
		// Calculate average test score.
		average = testTotal / stuCount;
		
		// This is the work done in the endOfJob() method
		// Output number of students and average test score.
		System.out.println("Number of Students: " + stuCount);
		System.out.println("Average Test Score: " + average);
		
		System.exit(0);
	}
}
