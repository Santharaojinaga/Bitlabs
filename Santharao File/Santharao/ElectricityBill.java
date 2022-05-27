/* 4. Write a program to Calculate Electricity Bill. Accept last month units and present units in string format from the user. 
      Calculate Electricity Bill for last month units, otherwise throw ArithementicException along with some error message.  
      Handle NumberFormatException while converting units into numerical value. 

  Calculate Electricity Bill based on following charges:

  ==> first 50 units charges are: 0.50 per/unit
  ==> next 100 units charges are: 1.75 per/unit
  ==> next 100 units charges are: 2.50 per/unit
  ==> above 250 units charges are: 2.90 per/unit

  Add 10% surcharge on overall bill.

*/

import java.util.*;
class ElectricityBill
  {
    public static void main(String args[])
    {
    double bill,total;
    String lmu,pmu;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter last month units:");
    lmu=sc.next();
    System.out.println("enter present month units:");
    pmu=sc.next();
  try{
    double x=Double.parseDouble(lmu);  
     if(x>0){
    if(x<=50)
     {
       bill=x/2;
      total=bill+(bill*10/100);
      System.out.println("Total electricity bill for last month is:"+total);
     }
     
     else if(x>50 && x<=150)
      {
        bill=(x*7)/4;
        total=bill+bill*10/100;
       System.out.println("Total electricity bill for last month is:"+total);
      }
      else if(x>150 && x<=250)
      {
        bill=5*x/2;
        total=bill+bill*10/100;
      System.out.println("Total electricity bill for last month is:"+total);
        }
       else
        {
        bill=29*x/10;
        total=bill+bill*10/100;
      System.out.println("Total electricity bill last month is:"+total);
          }
         }
       else
          {
            System.out.println("bill not generated"+"\n"+"units canont be negative");
          }
       }
    //Exception handling
        catch(Exception e)
           {
             System.out.println("NumberFormatException"+"\n"+"enter units properly");
           }
       
       }
  }
