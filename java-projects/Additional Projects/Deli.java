//Isaiah Smith
import java.util.Scanner;
public class Deli {
    // Message greeting
    public static void greet() {
        System.out.println("Welcome to the Sandwich Corral");
        System.out.println("You will be given choice for building your sandwich");
        System.out.println("Please enter your selection after each prompt");
        System.out.println("and then press the Enter key.");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Message greeting
        greet();
        // The user now inputs their sandwhich
        System.out.println("Please enter your sandwich choice.");
        System.out.print("Ham, Beef, Reuben, PBJ, Cheese, or Vegetarian: ");
        String sandwich = input.next();
		
        // The user inputs the type of bread they want
		
        System.out.println("Please enter your bread selection.");
        System.out.print("Rye, Wheat, White, Sourdough, or Pumpernickel: ");
        String bread = input.next();
        // USer chooses what type of condiements for their sandwhich
		
        System.out.println("Please enter your choice of condiment (one only).");
        System.out.print("Mayo, Mustard, Ketchup, none: ");
        String condiment = input.next();
        // USer enters the drink choice
		
        System.out.println("Please enter your drink choice.");
        System.out.print("Coke, Diet, Tea, Coffee, or Water: ");
        String drink = input.next();

        // The user now dictates if they want a whole sandwhich or half sandwhich
        System.out.println("Please enter 3.99 for a half sandwich or 5.99");
        System.out.print("for a whole sandwich: ");
        String size = input.next();

        System.out.println("You have entered the following information:");
        System.out.println("Sandwich:" + sandwich);
        System.out.println("Bread:" + bread);
        System.out.println("Condiment:" + condiment);
        System.out.println("Drinkt:" + drink);
        System.out.println("Tab:" + size);

        input.close();
    }
}

// You have entered the following information:
//Sandwich:beef
//Bread:wheat
//Condiment:mayo
//Drinkt:tea
//Tab:5.99