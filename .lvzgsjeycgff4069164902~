/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/



import java.util.Scanner;
class Temperature
{
//Define the main method
public static void main(String[] args)
{
//Declare the variables and initialize
int i,d;
float min;
//Take temperature of 7 days as a input from user
  //use Scanner class to take the input from user
  Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of days : ");
d=sc.nextInt(); //no of days.
 float temp[]=new float[d];
//checking different temperatrues using for loop
for(i=0;i<d;i++)
{
System.out.println("Enter the temperature of day : "+(i+1));
 temp[i]=sc.nextFloat();
}
//calculating low tempeature
min=temp[0];
  for(i=0;i<d;i++)
{
if(temp[i]<min)
{
  min = temp[i];
           
  }
}
 //printing result
System.out.println("The lowest temperature of the week is "+min+" degree celsius");
 }
}
