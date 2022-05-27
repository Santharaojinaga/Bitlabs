/* 1. Write a program to accept two numbers, one Arithmetic operator such as +, -, / , *  and print output of Arithmetic operation. 
   Write switch case to perform each operation. Handle ArithmeticException when you are performing division operation. 
*/
//Scanner class
import java.util.Scanner;
public class ArithmeticException {
//main method
    public static void main(String args[])
  {   //Scanner class object 
      Scanner sc= new Scanner(System.in);
    //Enter frist number
    System.out.println("Enter the a value");
    int a= sc.nextInt();
    //Enter Second number
    System.out.println("Enter the b value");
    int b=sc.nextInt();
    //selecting the operation to operate between the a and b
    System.out.println("Enter a number to select the operation between  a & b: \n 1. + (addition) \n 2 . - (substraction)\n 3. / (division) \n 4.* (multiplication)");
    int n =sc.nextInt();
    switch(n)
      {
          //addition 
        case 1 :
          System.out.println("the addition value of a & b is :"+(a+b));
          break;
          //substraction
        case 2 :
          System.out.println("The substraction value of a & b is :"+(a-b));
          break;
          //division the case to be handled 
        case 3 :
          try {
            //operating the exception
          System.out.println("The value after division of a & b is :"+(a/b));
         
      }
            //handling the exception
    catch(Exception e)
      {
        System.out.println(e);
        System.out.println("Exception handled");
      }
         break;
          
        case 4 :
          System.out.println("The value after multiplication of a & b is : " +(a*b));
          break;
          default :
            System.out.println("check the number you entered");
          break;
      }

    }
}