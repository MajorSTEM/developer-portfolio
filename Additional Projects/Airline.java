// Airline.java - This program determines if an airline passenger is
//eligible for a 25% discount.

import javax.swing.*;

public class Airline
{
   public static void main(String args[])
   {
       String passengerName = ""; // Passenger's name.
       String ageString = ""; // String version of passenger's age.
       int passengerAge = 0; // Passenger's age.
  
       // This is the work done in the housekeeping() method
       passengerName = JOptionPane.showInputDialog("Enter passenger's name: ");
       ageString = JOptionPane.showInputDialog("Enter passenger's age: ");
      
       passengerAge = Integer.parseInt(ageString);
      
       // detailLoop() method
       boolean flag=detailLoop(passengerAge);
      
       // Test to see if this customer is eligible for a 25% discount.
       if(flag) {
           JOptionPane.showMessageDialog(null,passengerName+" "+passengerAge + " "+" is eligible for discount",null,
               JOptionPane.INFORMATION_MESSAGE);
       }else {
           JOptionPane.showMessageDialog(null,passengerName+" "+passengerAge + " "+" is not currently eligible for discount",null,
               JOptionPane.INFORMATION_MESSAGE);
       }
       // This is the work done in the endOfJob()method
       endOfJob();      
      
   }  

   private static boolean detailLoop(int page) {
       boolean f = false;
       if(page<=10||page>=60) {
           f=true;
       }
       return f;
   }
   private static void endOfJob() {
       System.exit(0);
   }
}