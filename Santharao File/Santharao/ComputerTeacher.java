/* JFM1T9_Assignment3:
     Create a base class Teacher and a sub class ComputerTeacher.
     class ComputerTeacher extends the designation and collegename properties and work() method from base Teacher class,
     you need not declare these properties and method in ComputerTeacher sub class .
     Try accessing these properties using child class object in Main method.
  
     Sample Output:
     Designation       CollegeName
     ComputerTeacher      IIT
*/

class Teacher {
     //initializing variables
     String designation ="Teacher";
     String collegename = "IIT";
     public void disp() {
          System.out.println("Desigantion is "+designation+" and College Name is "+collegename);
     }
}

class ComputerTeacher extends Teacher {
     //main class
     public static void main(String[] args) {
          //Creating a new object
          ComputerTeacher obj = new ComputerTeacher();
          obj.disp();
     }
}

//Well Done
