/*  JFM1T7_Assignment4:

    Write a program to declare a static variable roll_number inside student class. Create 3 student objects and print their names and roll numbers.
    Hint: Use increment operator to get different value of roll_number for 3 students.

   
    Expected Output:
    Roll no:1  Name: Shree 
    Roll no:2  Name: Balaji
    Roll no:3  Name: Ajay
*/

public class StaticVariable {
    //main method
    public static void main(String[] args) {
        StaticVariable obj = new StaticVariable();
    }
    StaticVariable() {
        Student s1 = new Student();
        s1.setName("Shree");
        Student s2 = new Student();
        s2.setName("Balaji");
        Student s3 = new Student();
        s3.setName("Ajay");
        //displaying student name and Roll no
        System.out.println("Roll no = "+(s1.rollno++)+" Name = "+(s1.getName()));
        System.out.println("Roll no = "+(s2.rollno++)+" Name = "+(s2.getName()));
        System.out.println("Roll no = "+(s3.rollno++)+" Name = "+(s3.getName()));
    }
}
//creating class student
class Student {
    String name;
    static int rollno = 1;
    //add getters and setters
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static int getRollno() {
        return rollno;
    }
  //declare Student class andd add declare name, rollno(static)
    public static void setRollno(int rollno) {
        Student.rollno = rollno;
    }
}
