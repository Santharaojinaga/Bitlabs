import java.util.*;
abstract class Bank
  {
    long Accountno;
    long Panno;
    //abstract method
    abstract void rate_of_intrest();
    //non_abstartMethod
    void display()
    {
      System.out.println(Accountno+" "+Panno);
    }
  }
  class SBI_Bank extends Bank
     {
       public void rate_of_interest()
       {
         System.out.println("Rate of interest of SBI is 8%");
       }
     }
class Axis_Bank extends Bank{
  
    public void rate_of_interest()
    {
      System.out.println("Rate of interest of Axis is 7%");
    }
  }
class Abstract
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Bank sbi=new SBI_Bank();
       System.out.println("Enter account no");
      sbi.Accountno=sc.nextLong();
      System.out.println("Enter pan no");
      sbi.Panno=sc.nextLong();
      
    }
  }

  