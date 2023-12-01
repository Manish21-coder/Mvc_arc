package com.mvc_register.model;

import java.sql.*;


public class Daoimpl implements Dao {
	private Connection con;
	private Statement stmt;

	@Override
	public void connectDB() {
		
		 try {
			  
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg_ap_db","root","test");
		    stmt = con.createStatement();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }

	}

	@Override
	public boolean verifyLogin(String user, String pass) {
		
		try {
			ResultSet result = stmt.executeQuery("select * from login where email='"+user+"'and pass='"+pass+"'");
			return result.next();
			}catch(Exception e) {
					e.printStackTrace();
		}	
		return false;
	}

	@Override
	public boolean new_register(String name, String city, String email, String mobile) {
		
		try {
		 int res = 	stmt.executeUpdate("Insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
			return res>0;
		}catch(Exception e) {
			e.printStackTrace();
		}return false;
		
	}

	@Override
	public boolean update_register(String email,String mobile) {
			
		try {
			  int res = stmt.executeUpdate("update registration set mobile='"+mobile+"' where email ='"+email+"' ");
			return res>0;
			}catch(Exception e) {
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public void delete_register(String email) {
		try {
			  stmt.executeUpdate("Delete From registration  where email ='"+email+"' ");
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}

	
	public ResultSet read_register() {
		
		try {
			   ResultSet result =   stmt.executeQuery("select * from registration");
			return result;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
