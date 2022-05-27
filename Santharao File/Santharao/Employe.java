import java.util.*;
class Employe{
   String Name;
    int id;
    int salary;
    String dept;
  public static void main(String arg[])
  {
   Employe em1=new Employe();
    em1.Name="santha";
    em1.id=123;
    em1.salary=10000;
    em1.dept="bitlabs";
    Employe em2=new Employe();
    em2.Name="Ram";
    em2.id=143;
    em2.salary=20000;
    em2.dept="bitlabs";
  Employe em3=new Employe();
    em3.Name="sam";
    em3.id=156;
    em3.salary=30000;
    em3.dept="bitlabs";
    System.out.println(em1.Name+" "+em1.id+ " "+em1.salary+" "+em1.dept);
   System.out.println(em2.Name +" "+em2.id+" "+em2.salary+" "+em2.dept);
    System.out.println(em3.Name+" "+em3.id+" "+em3.salary+" "+em3.dept);
          
  }
}
