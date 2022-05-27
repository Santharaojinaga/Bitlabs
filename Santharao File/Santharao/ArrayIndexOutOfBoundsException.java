/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/
    //importing scanner class//
  import java.util.*;
    //creating ArrayIndexOutOfBoundsException class
public class ArrayIndexOutOfBoundsException
 {
   //main method
   public static void main(String args[])
       {
            //initializing the variables
             int n;
             Scanner sc=new Scanner(System.in);
             System.out.println("enter size of array:");
             n=sc.nextInt();
            //creating array of size n
            int a[]=new int[n];
            System.out.println("enter array elements:");
                //reading array elements from user using for loop
                 for(int i=0;i<n;i++)
                 {
                   a[i]=sc.nextInt();
                  }
           System.out.println("the array elements are:");
                //printing arrary elements using for loop
                for(int i=0;i<n;i++)
                 {
                    System.out.println(a[i]);
                  }
                  ////ArrayIndexOutOfBoundsException may occur
             System.out.println(a[55]);
        }
  }

