// This  program demonstrates the precedence and
// associativity of operators.
public class Operators
{
   public static void main(String args[])
   {
      int number1 = 20;
      int number2 = 5;
      int number3 = 17;
      int answer1, answer2, answer3;
      int answer4, answer5, answer6;

      answer1 = number1 * number2 + number3;
      System.out.println("Answer 1: " + answer1);

      answer2 = number1 * (number2 + number3);
      System.out.println("Answer 2: " + answer2);

      answer3 = number1 + number2 - number3;
      System.out.println("Answer 3: " + answer3);

      answer4 = number1 + (number2 - number3);
      System.out.println("Answer 4: " + answer4);
		

      answer5 = number1 + number2 * number3;
      System.out.println("Answer 5: " + answer5);

      answer6 = number3 / number2;
      System.out.println("Answer 6: " + answer6);
      System.exit(0);
   } 
}
