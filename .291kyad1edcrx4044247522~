/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/


 import java.util.Scanner;
   class TransposeMatrix
   {
  //Define the main method
  public static void main(String[] args)
     {
 //Declare the variables
  int i,j,row,col;
Scanner sc = new Scanner(System.in);
 //Take input from user to enter rows and column values
   System.out.println("enter the row value");
   row = sc.nextInt();
 System.out.println("Enter the col value");
 col=sc.nextInt();
 int a[][] = new int[row][col];
   
for(i=0;i<row;i++)
{
  for(j=0;j<col;j++)
  {
System.out.print("element ["+(i+1)+"],["+(j+1)+"] :");
 a[i][j]=sc.nextInt();
   }
 }
    System.out.println("matrix before transpose :");
 for(i=0;i<row;i++)
   {
   for(j=0;j<col;j++)
 {
    System.out.print(a[i][j] + "  ");
   }
     System.out.println( );
  }
  //Convert the square matrix into transpose
   System.out.println("matrix after transpose is :");
    for(i=0;i<col;i++)
     {
  for(j=0;j<row;j++)
   {
 //printing j and i instead of i and j
  System.out.print(a[j][i]+ "  ");
  }
//Print the transpose matrix
  System.out.println();
  }
   
   
  }
}
