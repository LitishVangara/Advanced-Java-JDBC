package org.jspiders.runtimevalues;

import java.sql.*;
import java.util.Scanner;

public class SelectFromTableUsingScanner2 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=Litish17@";
		String query = "SELECT * from litishdatabase.userdetails where MobileNumber=?";
		try 
		{
			Connection connect = DriverManager.getConnection(url);
			PreparedStatement ps = connect.prepareStatement(query);
			Scanner scan = new Scanner (System.in);
			boolean status = true;
			while (status) 
			{
				System.out.println("**************Forget Password.**************");
				System.out.println("Enter the Mobile Number : ");
				String mobile = scan.next();
				ps.setString(1, mobile);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) 
				{
					System.out.println("Your Password is "+rs.getString("Password"));
					status = false;
				}
				else
				{
					System.out.println("Please Enter Valid Mobile Number to get Password.");
				}
			}
			connect.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
