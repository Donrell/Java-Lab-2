
import java.util.Scanner;

/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/

public class NumericTypes
{
   public static void main (String [] args)
   {
      Scanner keyboard = new Scanner(System.in);// TASK #2 Create a Scanner object here
      // (not used for alternate)

      // Identifier declarations
      final int NUMBER = 2 ;        // Number of scores
      final double SCORE1 = 100;       // First test score
      final int SCORE2 = 95;        // Second test score
      final int BOILING_IN_F = 212;// Boiling temperature
      int fToC;// Temperature Celsius
      double average, diameter, radius, volume;               // Arithmetic average
      String output;                // Line of output
      String firstName, lastName, fullName;
      char firstIni, lastIni;

      // TASK #2 declare variables used here
      // TASK #3 declare variables used here
      // TASK #4 declare variables used here

      // Find an arithmetic average.
      average = (SCORE1 + SCORE2) / NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = 5/9 * (BOILING_IN_F - 32);
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";
      System.out.println(output);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #2 HERE
      System.out.print("Enter first name  ");
      firstName = keyboard.nextLine(); // Prompt the user for first name
      System.out.println(firstName);// Read the user's first name

      System.out.print("Enter last name  ");
      lastName = keyboard.nextLine(); // Prompt the user for first name
      System.out.println(lastName);// Prompt the user for last name

      fullName = firstName + " " +lastName;
      System.out.print("Full Name: " +  fullName);//reads full name
      // Concatenate the user's first and last names
      // Print out the user's full name

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #3 HERE
      firstName = firstName.toUpperCase();
      firstIni = firstName.charAt(0);
      System.out.print(firstIni);

      lastName = lastName.toUpperCase();
      lastIni = lastName.charAt(0);
      System.out.print(lastIni);// Get the first character from the user's first name
      // Print out the user's first initial
      // Convert the user's full name to uppercase
      // Print out the user's full name in uppercase

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #4 HERE
      System.out.print("Enter diameter: ");// Prompt the user for a diameter of a sphere
      diameter = keyboard.nextDouble();// Read the diameter
      radius = diameter / 2; // Calculate the radius
      volume = (4/3)*3.14*(radius * radius * radius);;// Calculate the volume
      System.out.println("volume: "+ volume);// Print out the volume
   }
}