package Dao.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.entity.Product;


@SuppressWarnings("deprecation")
public class DaoImpl implements Dao
{
	SessionFactory sf=null;
	public DaoImpl()
	{
		sf= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	public boolean AddP(Product p) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction tnx=s.beginTransaction();
		s.save(p);
		tnx.commit();
		s.close();
		return true;
	}
	public boolean delPro(int id) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction tnx=s.beginTransaction();
		Product p=s.get(Product.class, id);
		s.delete(p);
		tnx.commit();
		s.close();
		return true;
	}
	public List<Product> getByUsername(String name) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Query q=s.createQuery("from Product where product_name='"+name+"'");
		List<Product> products=new ArrayList();
		products=q.list();
		s.close();
		return products;
		
	}
	@SuppressWarnings("unchecked")
	public List<Product> getAllUsers() {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		@SuppressWarnings("rawtypes")
		Query q=s.createQuery("from Product");
		@SuppressWarnings("rawtypes")
		List<Product> products=new ArrayList();
		products=q.list();
		s.close();
		return products;
	}
	public boolean updatepro(int id) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		Session s=sf.openSession();
		Transaction tnx=s.beginTransaction();
		Product p=s.get(Product.class, id);
		System.out.println("enter price to be updated");
		int price=sc.nextInt();
		p.setProduct_price(price);
		System.out.println("enter name to be updated");
		String name=sc.next();
		p.setProduct_name(name);
		System.out.println("enter quantity to be updated");
		int n=sc.nextInt();
		p.setProduct_qty(n);
		tnx.commit();
		s.close();
		return true;
	}
}
