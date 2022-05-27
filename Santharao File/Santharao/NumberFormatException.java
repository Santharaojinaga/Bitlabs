/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/

 import java.util.*;
   //create class NumberFormatException//
  class NumberFormatException
{
//initializing variables//
//method test is created//
  int test(int a,int b)
  {
     return (a+b);
  }
//main method//
public static void main(String args[])
  {
//input from user//
    Scanner sc=new Scanner(System.in);
//object created//
    NumberFormatException n=new NumberFormatException ();
    System.out.println("Enter a value");
//reading values //
    String c=sc.next();
    System.out.println("Enter b value");
    String d=sc.next();
//converting into numericals where NumberFormatException may occur//
    int w=Integer.parseInt(d);
    int q=Integer.parseInt(c);
//printing output//
    System.out.println("addition is:"+n.test(w,q));
  }
   
}
    