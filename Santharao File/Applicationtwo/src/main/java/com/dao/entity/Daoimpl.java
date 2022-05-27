package com.dao.entity;
import java.util.ArrayList;
import java.util.List;


import com.bitlabs.entity.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.bitlabs.entity.Users;

public class Daoimpl implements Dao
{
    SessionFactory sf=null;
    public Daoimpl()
    {
    	sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }
	public boolean addUser(Users us) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Transaction tnx=s.beginTransaction();
		s.save(us);
		tnx.commit();
		s.close();
		return true;
	}
	public List<Users> loginm(String n,String p) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Query q=s.createQuery("select u.uname,u.password from Users as u where u.uname='"+n+"' and u.password='"+p+"' ");
		List<Users> us=new ArrayList();
		us=q.list();
		s.close();
		return us;
		
	}
	
	
	
}
