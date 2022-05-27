/* 3. Write a program to accept firstName, lastName and mobileNumber in string format. 
   Print number of characters in firstName and lastName, and print sum of digits of a mobileNumber. 
   Handle NumberFormatException while converting mobileNumber to long.
*/
import java.util.*;
//Eception class
public class NumberFormatException {
  //main method

    public static void main(String args[])
    {
      // first name & last name are strings
      String firstname,lastname;
      //mobile number also considered as string
      String mobilenum;
      long sum=0;
      //to read the first name and last name and phone number from the user
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first name:");
      firstname=sc.next();
      System.out.println("Enter last name:");
      lastname=sc.next();
      //lenght of the first name string
      System.out.println("Number of characters in first name are:"+firstname.length());
      //lenght of the last name string
      System.out.println("Number of characters in last name are:"+lastname.length());
      System.out.println("Enter mobile number(Only 10 digits):");
       mobilenum=sc.next();
      //mobile number String lenght for checking weather there are 10 digtis or more
       int a=mobilenum.length();
      if(a==10){
      try{
        //converting the phone number string to long
      long  x=Long.parseLong(mobilenum);
      //command parseLong is used to convert the string to long int
      
      while(x!=0)
           {
            sum = sum + x % 10;
            x = x/10;
          }
        System.out.println(sum);
        }
      catch(Exception e)
        {
          System.out.println("NumberFormatException occured"+"\n"+"Enter proper number");
        }
        }
       else{
          System.out.println("Enter a valid number");
        }
      }
    }