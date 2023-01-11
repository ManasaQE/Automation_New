package com.account.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rkdigital","root","admin");
		// create statement/query
		Statement stmt=con.createStatement();
		String q="Select * from Testing";		
		ResultSet rs=stmt.executeQuery(q);
		while(rs.next()) {
		int empid=rs.getInt("ID");	
		String firstName=rs.getString("FirstName");
		String lastName=rs.getString("LastName");
		String city=rs.getString("City");
		System.out.println(empid+"     "+firstName+"     "+lastName+"      "+city );
		
		}
		
	con.close();	

	}

}
