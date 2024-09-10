/* Program Name: CollegeAdmission.java 
   Function: This program determines if a student will be admitted or rejected. 
   Input:  Interactive
   Output: Accept or Reject
*/  

import javax.swing.JOptionPane; 
public class CollegeAdmission
{
   public static void main(String args[])
   { 
     // Declare variables
	 String testScoreString;
	 String classRankString;
	 int testScore;
	 int classRank;
	 
	




     
     // Get input and convert to correct data type
     testScoreString=JOptionPane.showInputDialog("Enter test score here:");
	 testScore=Integer.parseInt(testScoreString);
	 classRankString=JOptionPane.showInputDialog("Enter class rank please:");
	 classRank=Integer.parseInt(classRankString);





     // Test using admission requirements and print Accept or Reject 
     if( testScore >= 90 )
     {
	if( classRank >= 25)
        {
     	   System.out.println("Accept");
        }
	else
	   System.out.println("Reject"); 
     }
     else 
     {
	if( testScore >= 80 )
	{
	   if( classRank >= 50 )
	      System.out.println("Accept");
	   else
	      System.out.println("Reject");
	}
	else
	{
           if( testScore >= 70 )
	   {
		if( classRank >=75 ) 
		   System.out.println("Accept");
		else
		   System.out.println("Reject");
	   }
	   else
		System.out.println("Reject");
        }
      }
   } // End of main() method
   
} // End of CollegeAdmission class
