/* JFM1T6_Assignment2:
   Write a method that takes 2 numbers as arguments/parameters and returns the value of num2 to the power of num1 back to the main method.
   Prompt the user for the base and power values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
    
   Expected Output:
   result = 9
   
*/
import java.util.Scanner;

public class Power {
   //main method
   public static void main (String[] args) {
      
      //declare variables n,p,r and initialize r as one.
      int num1, num2;
      //create scanner class object
      Scanner sc = new Scanner(System.in);
      //take input from user
      System.out.print("base = ");
      num1 = sc.nextInt();
      System.out.print("power = ");
      num2 = sc.nextInt();
      //creating a object
      Power obj = new Power();
      int result = obj.exp(num1, num2);
      
      //print result
      System.out.println("Result = "+result);
   }
   int exp(int num1, int num2) {
      return ((int)Math.pow(num1, num2));
   }
}