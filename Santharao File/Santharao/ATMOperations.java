/* 2. Write a program to perform ATM operations such as deposit, withdraw and balance enquiry. Display list of options for user selection. 
   Accept option from the user and execute specified method. throw Exception when user trying to withdraw amount more than 3 times.
*/
import java.util.*;
class WithdrawLimitException extends Exception
  {
    WithdrawLimitException(String count)
    {
      super(count);
    }
  }
class AtmOperations
  {
    long balance;
    int count=0;
    void withdraw(long amt)throws WithdrawLimitException
    {
     if(count<=2){
     if(balance>=amt)
     {
       balance=balance-amt;
       System.out.println("withdraw successfull");
       count++;
      }
     else
     {
       System.out.println("insufficient balance");
     }
       }
      else{
        throw new WithdrawLimitException("limit over");
      }
    }
   void deposit(int amt)
    {
      balance=balance+amt;
      System.out.println("deposit successfull");
    }
   void checkbalance()
    {
      System.out.println("balance is: "+balance);
    }
  }
class ATMOperations
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      AtmOperations atm=new AtmOperations();
      atm.balance=10000;
      char ch='y';
      
      do
      {
       System.out.println("1.Withdraw\n2.Deposit\n3.Checkbalance");
        System.out.println("select option");
        int option=sc.nextInt();
        switch(option)
           { 
             
            case 1:
              System.out.println("enter amount:");
              int amount=sc.nextInt();
              try{
              atm.withdraw(amount);
                }
              catch(Exception e)
                {
                  System.out.println("withdraw limit over");
                }
              break;
            case 2:
              System.out.println("enter amount");
              int amount1=sc.nextInt();
              atm.deposit(amount1);
              break;
            case 3:
              atm.checkbalance();
              break;
            default:
              System.out.println("Invalid input");
          }
        
          System.out.println("Do you want to continue:");
          ch=sc.next().charAt(0);
                 
        }

          while(ch=='y');
      }
  }