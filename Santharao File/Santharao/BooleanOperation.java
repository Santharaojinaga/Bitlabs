/*  JFM1T2_Assignment3:

     Print the results for the following statements considering x = true and y = false
             1. x&&y
             2. x||y
             3. !x
             4. !y
     Prompt the user input from the terminal.
             
     Sample Input:
     Enter x as boolean value(true/false): 
     true
     Enter y as boolean value(true/false): 
     false
     
     Expected Output:
     x&&y is: false
     x||y is: true
     !x is: false
     !y is: true

*/

//import statements for java program to read inputs using Scanner class


/*Take input from user
  System.out.println("Enter x as boolean value(true/false): ");
  boolean x=sc.nextBoolean();
*/

//print apppropriate result for boolean operations

import java.util.*;
class BooleanOperation
  {
    public static void main(String[]args)
    {
      boolean x,y;
      Scanner sc=new Scanner(System.in);
      System.out.println("the boolean value x is :(true/false");
      System.out.println("the boolean value y is :(true/false");
      x=sc.nextBoolean();
      y=sc.nextBoolean();
       System.out.println("x&&y"+(x&&y));
       System.out.println("x||y"+(x||y));
       System.out.println("!x"+!x);
       System.out.println("!y"+!y);
      }
  }
      