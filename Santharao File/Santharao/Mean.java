/* JFM1T6_Assignment3:

   Write a method that takes any numbers as arguments/parameters and return the mean value back to main method.
   Prompt the user for the  values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
   num3 = 4

   Expected Output:
   result = 3
   
*/

import java.util.Scanner;

public class Mean {
   //main method
   public static void main(String[] args) {
      
      //declare variable
      int n;
      
      //create scanner object
      Scanner sc = new Scanner(System.in);
      
      //take input from user
      System.out.print("Enter the value of n : ");
      n = sc.nextInt();
      
      //Instanciating an object
      Calc obj = new Calc();
      int result = obj.meanCalc(n);
      //printing result
      System.out.println("Result = "+result);
      
   }
}
//Class to return mean value to the main
class Calc {
   //method to calculate mean
   public int meanCalc(int n) {
      
      //Create Scanner class object
      Scanner sc = new Scanner(System.in);
      int[] num = new int[n];
      
      //assigning values for an array of numbers dynamically
      for(int i = 0; i<num.length; i++) {
         System.out.print("num"+(i+1)+" = ");
         num[i] = sc.nextInt();
      }
      //initializing sum = 0
      int sum = 0;
      
      //check the for loop for number of values entered in input
      for(int var : num) {
         sum += var;
      }
      //calculating mean
      int mean = sum/n;
      //returning mean value to the meanCalc method
      return (mean);
   }
}