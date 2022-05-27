package com.dao.entity;

import java.util.List;


import com.bitlabs.entity.Users;

public interface Dao 
{
   public boolean addUser(Users us);
   public List<Users> loginm(String n,String p);
  
   
}
