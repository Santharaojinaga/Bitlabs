/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
import java.util.*;
       //creating ArithmeticException class
class ArithmeticException
  {
       //parameterized method div is created which will take 2 values
       int div(int q,int w)
      {
         //ArithmeticException may occur here
         System.out.println("the division of two numbers is:"+q/w);
          return (q/w);
      }
         //arth
         //creating main method
         public static void main(String args[])
    {
      //object creation
      ArithmeticException c=new ArithmeticException();
      //for taking inputs from user
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value and b values");
      //calling div method
       int z=c.div(sc.nextInt(),sc.nextInt());
     //exception occurs only when the value of b is given as "0".
    }
}