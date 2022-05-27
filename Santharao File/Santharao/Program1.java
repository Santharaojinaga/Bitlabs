import java.util.Scanner;
 public class Program1
{
    public static void main(String args[]){
         Scanner s = new Scanner(System. in);
        double r;
        System.out.println("enter radius");
        r=s.nextDouble();
        double area=3.14*r*r;
        double perimeter=2*3.14*r;
         System.out.println("areaof circle="+area);
         System.out.println("perimeterof circle="+perimeter);
        }  
      }
 