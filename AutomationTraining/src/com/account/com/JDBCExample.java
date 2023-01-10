package com.account.com;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	// Create a connection.
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rkdigital","root","admin");
	// create statement/query
	Statement stmt=con.createStatement();
	//String q="Insert into Testing Values(2,'Pavan','Vang','Hyderabad')";
	//String q="Update Testing set FirstName='Kiran' where Id=3";
	String q="Delete from Testing where Id=3";
	// execute query
	stmt.execute(q);
	//close the connection
	con.close();
	System.out.println("Query executed successfully");

	}

}
