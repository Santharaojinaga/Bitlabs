/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.Scanner;

class TwoDimentionalArray {
  //main class
public static void main(String[] args)
  {// intializing the variables
int i,j,row,col; // i&j indicates the index numbers
   //row and col indicates the row and coloumn number
    //scanner class to read the input from the user
    Scanner sc = new Scanner(System.in);
    //reading row value
 System.out.println("enter the row value");
    row = sc.nextInt();
    //reading coloumn value
  System.out.println("Enter the col value");
    col=sc.nextInt();
    //intializinf the  array
     int a[][] = new int[row][col];
    //reading the array input from user
  for(i=0;i<row;i++)
      {
        for(j=0;j<col;j++)
          {
  System.out.print("element ["+(i+1)+"],["+(j+1)+"] :");
     a[i][j]=sc.nextInt();
    }
      }
    //printing the array
    System.out.println("the array is :" );
    for(i=0;i<row;i++)
      {
       for(j=0;j<col;j++)
          {
     System.out.print(a[i][j] + "  "); 
      // print makes the position of the elements in array as matrix
          }
     System.out.println( );
      }
//assuming the first value of the array as the max and comparing it with all the variables in the array
   int post1=0,post2=0;
    //so as to know the position of the variable we have intialized post1&post2
  int max=a[0][0];
  for(i=0;i<row;i++)
    {
   for(j=0;j<col;j++)
        {
   if(a[i][j]>max)
                  {
   max=a[i][j];
   post1=i;
                   
    post2=j;
      }
           
    }
     
      }
    //printing out the result.
    System.out.println("the highest number in the matrix is "+max+" the position of the element is a["+(post1)+"],"+"["+(post2)+"]");
}
}