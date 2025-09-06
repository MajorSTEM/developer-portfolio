//Isaiah Smith


package acronym;
import java.util.Scanner;


class Acronym{
 
    public static void main(String[] args) { 
	
        System.out.println(" This program asks the user for three words.");
		System.out.println("The first letter of each word is extracted, and then the ");
		System.out.println("acronym formed by the three letters is displayed.");
		
        System.out.println("Please enter three words, separated by blanks: ");
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        StringBuilder acr = new StringBuilder();
        String[] wordArray = str.split(" ");
        
        for(String w: wordArray) {
            acr.append(w.substring(0,1));
        }
      
        System.out.println("The acronym of these words is " + acr);
    }
}



//  This program asks the user for three words.
//The first letter of each word is extracted, and then the
//acronym formed by the three letters is displayed.
//Please enter three words, separated by blanks:
//Too Much Info
//The acronym of these words is TMI
