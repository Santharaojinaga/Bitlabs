/*JFM1T9_Assignment2:
    Write a BankAccount class with members account_number and account_balance  and prevent other class objects 
    (assuming them as hackers who can steal your confidential information) to access BankAccount details.
    Steps to Follow:
    Step1: Create account_number and account_balance as member variables for BankAccount class
    Step 2: Add setter and getter methods for the above member variables 
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter BankAccount Number : 6789023
    Enter Current Balance    : 67,000.89

    Expected Output:
    BankAccount Number : 6789023
    Current Balance    : 67000.89
    
*/
import java.util.Scanner;
class BankAccount { 
   //declare account_number , account_balance
   private int account_number;
   private float account_balance;
   //create getters and setters
   public void setNum(int num) {
       this.account_number = num;
   }
   int getNum() {
       return this.account_number;
   }
   public void setBal(float bal) {
       this.account_balance = bal;
   }
   float getBal() {
       return this.account_balance;
   }
}  

class ExpertHacker  {
    //main method
    public static void main(String[] args) {
        //Scanner class is used to read input from users
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter BankAccount Number = ");
        int a = sc.nextInt();
        System.out.println("Enter BankAccount Balance = ");
        float b = sc.nextFloat(); 
        //creating an object
        BankAccount obj = new BankAccount();
        obj.setNum(a);
        obj.setBal(b);
        System.out.println("BankAccount Number : "+obj.getNum());
        System.out.println("BankAccount Balance : "+obj.getBal());
    }
}
//Well Done
