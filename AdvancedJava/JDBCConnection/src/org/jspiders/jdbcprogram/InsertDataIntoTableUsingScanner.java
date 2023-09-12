package org.jspiders.jdbcprogram;

import java.sql.*;
import java.util.Scanner;

public class InsertDataIntoTableUsingScanner 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=Litish17@";
		String query = "insert into litishdatabase.student values(?,?,?,?)";
		try 
		{
			Connection connect = DriverManager.getConnection(url);
			System.out.println("Connection Established.");
			PreparedStatement ps =connect.prepareStatement(query);
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter Roll Number : ");
			int rollNo = scan.nextInt();
			ps.setInt(1,rollNo);
			System.out.println("Enter the Name : ");
			String name = scan.next();
			ps.setString(2,name);
			System.out.println("Enter the Percentage : ");
			double percentage = scan.nextDouble();
			ps.setDouble(3,percentage);
			System.out.println("Enter the Stream : ");
			String stream = scan.next();
			ps.setString(4,stream);
			ps.executeUpdate();
			System.out.println("Registration Successfull.");
			connect.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
