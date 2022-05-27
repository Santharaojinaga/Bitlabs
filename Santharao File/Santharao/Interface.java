import java.util.*;
interface Bank
  {
    long Accountno=1234567;
    
    //abstract method
    public void rate_of_interest();
    }
  class SBI_Bank implements Bank
     {
       public void rate_of_interest()
       {
         System.out.println("Rate of interest of SBI is 8%");
       }
     }
class Axis_Bank implements Bank{
  
    public void rate_of_interest()
    {
      System.out.println("Rate of interest of Axis is 7%");
    }
  }
class Interface
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Bank sbi=new SBI_Bank();
      Bank axis=new Axis_Bank();
      axis.rate_of_interest();
      sbi.rate_of_interest();
      }
  }