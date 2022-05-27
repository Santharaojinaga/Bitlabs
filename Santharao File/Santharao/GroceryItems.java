/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;

public class GroceryItems 
{

//Define the main method
public static void main(String arg[])
  {
  
 //Declare and initialize variables
   Double max;
 //Take the 10 different expenses price
Scanner sc=new Scanner(System.in);
 double a[]=new double[10];
  max=a[0];
System.out.println("enter expenses prices in store are:");
  //Check the 10 different expenses price using for loop
 for(int i=0;i<10;i++)
  {
   a[i]=sc.nextDouble();
  }
   for(int i=0;i<10;i++)
   {
   //Calculate the highest price in all exp
  if(a[i]>max)
   {
   max=a[i];
     }
   }
  //printing the result
  System.out.println("the highest prices inall expenses is:");
System.out.println(max);
    }
}