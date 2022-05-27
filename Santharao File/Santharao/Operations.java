/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.*;
class Operations
  {
    public static void main(String[]args)
    {
      int a,b,c,d,e,f,j,k,l,m;
      Scanner sc=new Scanner(System.in);
      System.out.println("input a and b values:");
       a=sc.nextInt();
       b=sc.nextInt();
      System.out.println("Differnce of two numbers is:" +(a-b));
      c=sc.nextInt();
      d=sc.nextInt();
       System.out.println("Product of two numbers is:" +(c+d));
       e=sc.nextInt();
       f=sc.nextInt();
      System.out.println("Division of two numbers is:" +(e/f));
      j=sc.nextInt();
      k=sc.nextInt();
      System.out.println("Incriment the numbers is:" +(++j + ++k));
      j=sc.nextInt();
      k=sc.nextInt();
      System.out.println("Decrement the numbers is:" +(--j - --k));
       System.out.println("Enter l and m Values:");
       l=sc.nextInt();
       m=sc.nextInt();
      System.out.println("Reminder of the two numbers is:" +(l%m));
    
      }
    }

/* Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//calculate difference,product,division,increment and remainder 

//print appropriate result for all operation

