package com.pst.SMS.Util;

import java.sql.Connection;
import java.sql.DriverManager;

// its helper class for data base
public class DbConnection {

	// load the driver
	// get the connection
	// creating statement -- SQL query
	// execute get result 
	// close the connection
	
	private static Connection con =null;
	
	public static Connection getConn() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student managment System","root","");  
		}
		catch(Exception e){
			e.printStackTrace();
		}
	return con;
	}
	
}
