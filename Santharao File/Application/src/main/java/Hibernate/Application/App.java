package Hibernate.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bitlabs.entity.Product;

import Dao.entity.Dao;
import Dao.entity.DaoImpl;


/**
 * Hello world!
 *
 */
public class App 
{
	Product p=new Product();
	Dao d=new DaoImpl();
	public void addproduct()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String n=sc.next();
		p.setProduct_name(n);
		System.out.println("enter price");
		double pr=sc.nextDouble();
		p.setProduct_price(pr);
		System.out.println("enter quantity");
		double q=sc.nextDouble();
		p.setProduct_qty(q);
		boolean b=d.AddP(p);
		if(b==true)
		{
			System.out.println("product added successfull");
		}
		else
		{
			System.out.println("product added not successfull");
		}
	}
	public void deleteproduct()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int n=sc.nextInt();
		boolean b=d.delPro(n);
		if(b==true)
		{
			System.out.println("product deleted successfull");	
		}
		else
		{
			System.out.println("product deleted unsuccessfull");
		}
		
	}
	public void update()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int x=sc.nextInt();
		boolean b=d.updatepro(x);
		if(b==true)
		{
			System.out.println("updated succesfully");
			
	     }
		else
		{
			System.out.println("update failed");
		}
	}
	public void getpbyname()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String n=sc.next();
		
		 List<Product> p=d.getByUsername(n);
		 for(Product pr:p)
		 {
			
		System.out.println(n+"-ID: "+pr.getProduct_id()+" "+n+"-quantity: "+pr.getProduct_qty()+" "+n+"-price: "+pr.getProduct_price());
	}
	}
	public void getAll()
	{
		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Product> p=new ArrayList();
		p=d.getAllUsers();
		for(Product pr:p)
		{
			System.out.println("P.ID:"+" "+pr.getProduct_id());	
			System.out.println("P.NAME:"+" "+pr.getProduct_name());
			System.out.println("P.PRICE:"+" "+pr.getProduct_price());	
			System.out.println("P.QUANTITY:"+" "+pr.getProduct_qty());
		}
	}
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        App app=new App();
        System.out.println("1.AddProduct");
        System.out.println("2.deleteProduct");
        System.out.println("3.updateProduct");
        System.out.println("4.getbyname");
        System.out.println("5.display all");
        System.out.println("Select option");
        int option=sc.nextInt();
        switch(option)
        {
        case 1:
        	app.addproduct();
        	break;
        case 2:
        	app.deleteproduct();
        	break;
        case 3:
        	app.update();
        	break;
        case 4:
        	app.getpbyname();
        	break;
        case 5:
        	app.getAll();
        	break;
        default:
        	System.out.println("Invalid option");
	}
    }
}
