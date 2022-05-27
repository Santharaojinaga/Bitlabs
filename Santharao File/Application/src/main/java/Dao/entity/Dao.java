package Dao.entity;

import java.util.List;

import com.bitlabs.entity.Product;

public interface Dao {
	
	public boolean AddP(Product p);
	public boolean delPro(int id);
	public  List<Product> getByUsername(String name);
	public List<Product> getAllUsers();
	public boolean updatepro(int id);

}
