package org.jspiders.jdbcprogram;

import java.sql.*;

public class InsertDataIntoTable 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=Litish17@";
		String query = "insert into litishdatabase.student values(1010,'Baba',88.0,'Btech')";
		try 
		{
			Connection connect = DriverManager.getConnection(url);
			System.out.println("Connection Established.");
			Statement statement2 = connect.createStatement();
			System.out.println("Platform Created.");
			statement2.executeUpdate(query);
			System.out.println("Query Executed and Record inserted into Table.");
			connect.close();
			System.out.println("Connection Closed.");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
