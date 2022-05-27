/* 5. Write a program to find prime numbers from given two arrays and store in 3rd array. 
      Handle ArrayIndexOutOfBoundsException while storing values into 3rd array.
*/
import java.util.Scanner;
public class ArrayIndexOutOfBoundsException
{
  public static void main(String args[])
  {
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of 1st array");
    //n represents the size of array 1
    int n =sc.nextInt();
    //a[ ] gives the first array
      int a[] = new int [n];
    System.out.println("Enter the size of 2nd array");
    //m represents the size of the second array  
    int m = sc.nextInt();
    //b[] is the second array
    int b[] = new int [m];
    //reading the elemnts for the both the arrays
    System.out.println("Enter the elemnts of 1st array");
    System.out.println("Enter "+n+" elements");
    //reading the elements for frist array
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("Enter the elements of 2nd array");
    System.out.println("Enter "+m + " elements");
    //reading the elements for second array
    for(i=0 ; i<m;i++)
    {
      b[i]=sc.nextInt();
    }
    //for counting the factors intializing the count =0;
    int count=0;
    //checking the elements of the array as prime number or not
    try{
   for (i=0 ; i<n; i++)
    {
      for(j=1 ; j<=a[i];i++)
        {
          j++;
            if(a[i]%j==0)
            {
              count++;
            }
        }
      if(count==2)
      {
        System.out.println(a[i]);
      }
    }
      }
    catch(Exception e)
      {
        System.out.println(e);
      }
  }    
}
