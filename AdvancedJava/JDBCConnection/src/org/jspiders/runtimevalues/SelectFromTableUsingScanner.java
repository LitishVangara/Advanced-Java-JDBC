package org.jspiders.runtimevalues;

import java.sql.*;
import java.util.Scanner;

public class SelectFromTableUsingScanner 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=Litish17@";
		String query = "SELECT * from litishdatabase.userdetails where Email=? and Password=?";
		try 
		{
			Connection connect = DriverManager.getConnection(url);
			PreparedStatement ps = connect.prepareStatement(query);
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter Email : ");
			String email = scan.next();
			System.out.println("Enter Password : ");
			String password = scan.next();
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) 
			{
				System.out.println("Successfull.");
				System.out.println(rs.getString("FirstName")+" Welcome to JDBC Program.");
			}
			else
			{
				System.out.println("Please Enter Valid Email or Password.");
			}
			connect.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
