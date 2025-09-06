// AnswerSheet.java - This program prints a quiz answer sheet.
// Input:  None.
// Output: Answer Sheet.

import javax.swing.JOptionPane;
public class AnswerSheet
{
	public static void main(String args[])
	{
	   
	   String quizName;
           int partCounter;
           int questionCounter;
           final String QUIT = "ZZZ";
           final int PARTS = 5;
           final int QUESTIONS = 3;
           final String PART_LABEL = "Part ";
           final String LINE = ". _____";

     	   // This is the work done in the housekeeping() method
           quizName = JOptionPane.showInputDialog("Enter quiz name or " + QUIT + " to quit: ");

           // This is the work done in the detailLoop() method
           while(quizName.compareTo(QUIT) != 0)
           {
              System.out.println(quizName);
              partCounter = 1;
              while(partCounter <= PARTS)
              {
                 System.out.println(PART_LABEL + partCounter);
                 questionCounter = 1;
                 while(questionCounter <= QUESTIONS)
                 {
                    System.out.println(questionCounter + LINE);
                    questionCounter++;
                 }
                 partCounter++;
              }
              quizName = JOptionPane.showInputDialog("Enter quiz name or " + QUIT + " to quit: ");
           }
           // This is the work done in the endOfJob() method
           System.exit(0);
	} // End of main() method.

} // End of AnswerSheet class.
