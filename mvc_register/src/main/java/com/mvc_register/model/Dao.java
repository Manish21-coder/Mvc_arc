package com.mvc_register.model;

import java.sql.ResultSet;

public interface Dao {
	public void connectDB();
	public boolean verifyLogin(String user,String pass);
	public boolean new_register(String name,String city,String email,String mobile);
	public boolean update_register(String email,String mobile);
	public void delete_register(String email);
	public ResultSet read_register();

}
