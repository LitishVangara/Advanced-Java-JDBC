package org.jspiders.jdbcprogram;

import java.sql.*;

public class EstablishConnection 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=Litish17@";
		try 
		{
			Connection connect = DriverManager.getConnection(url);
			System.out.println("Connection Established.");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
