package com.swingdemo;

import java.lang.reflect.Executable;
import java.sql.*;


public class Main12 {
	
	Connection con ;
	
	public void connectdb()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/players","root","");
			
			System.out.println("connection established");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void insertdb(String nm ,int a)
	{
		
		String str = "insert into people value (?,?)";
		try
		{
			PreparedStatement ps = con.prepareStatement(str);
			ps.setString(1, nm);
			ps.setInt(2, a);
			
			int result = ps.executeUpdate();
			
			System.out.println("data inserted successsfully ...");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		
		Main12 obj = new Main12();
		obj.connectdb();
		obj.insertdb("babu", 20);
		

	}

}
