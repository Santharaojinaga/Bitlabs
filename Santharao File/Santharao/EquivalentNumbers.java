/* JFM1T7_Assignment3:

   Accept an integer number as input from the console and when the program is executed print the binary, octal and hexadecimal equivalent of the given number.
   Prompt the user for the  values to be input from the terminal
   Hint: Refer Java Documentation and look for the appropriate Wrapper class method

   Sample Input: 20
   
   Expected Output: Binary equivalent: 10100 Octal equivalent: 24 Hexadecimal equivalent: 14
   
*/

import java.util.Scanner;
public class EquivalentNumbers {
   //main method
   public static void main(String[] args) {
      //creating an object
      Convert obj = new Convert();
      //printing value
      obj.getVal();
      obj.convert();
       
   }
}
//create Convert class in that declare variables
class Convert {
   //declaring variable
   int num;
   //initialize Convert class construtor
   public void getVal() {
      //Scanner class is used to take input from users
      Scanner sc = new Scanner(System.in);
      //taking input from users
      System.out.println("Enter the Number = ");
      num = sc.nextInt();
   }
   public void convert() {
      String hexa = Integer.toHexString(num);
      System.out.println("HexaDecimal value is "+hexa);
      String octal = Integer.toOctalString(num);
      System.out.println("Octal value is = "+octal);
      String binary = Integer.toBinaryString(num);
      System.out.println("Binary value is = "+binary);
   }
}

