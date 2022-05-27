package Hibernate.Applicationtwo;

import java.util.List;
import java.util.Scanner;


import com.bitlabs.entity.Users;
import com.dao.entity.Dao;
import com.dao.entity.Daoimpl;
public class App 
{
	Users us=new Users();
	Dao d=new Daoimpl();
	public void register()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		us.setUname(name);
		System.out.println("enter mobilenumber");
		long m=sc.nextLong();
		us.setMobile(m);
		System.out.println("enter your email");
		String e=sc.next();
		us.setEmail_id(e);
		System.out.println("enter your password");
		String p=sc.next();
		us.setPassword(p);
		boolean b=d.addUser(us);
		if(b==true)
		{
			System.out.println("inserted succesfully");
		}
		else
		{
			System.out.println("Insertion failed");
		}	
	}
	public void loginmod()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String e=sc.next();
	    System.out.println("enter your password");
	    String p=sc.next();
		List<Users> us1 =d.loginm(e,p);
	if(us1.size()!=0)
	{
		System.out.println("Login succesfull");
		}
	else
	{
		System.out.println("In valid users");
	}
	 }
	
		
	    
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        App app=new App();
        System.out.println("1.register");
        System.out.println("2.Login");  
        int option=sc.nextInt();
        switch(option)
        {
        case 1:
        	app.register();
        	break;
        case 2:
        	app.loginmod();
        	break;
        default:
        	System.out.println("Invalid option");
	}
    }
}
