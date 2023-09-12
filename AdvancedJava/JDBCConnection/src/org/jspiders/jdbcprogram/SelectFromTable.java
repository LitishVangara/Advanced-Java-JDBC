package org.jspiders.jdbcprogram;

import java.sql.*;

public class SelectFromTable 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=Litish17@";
		String query = "select * from litishdatabase.student where RollNo=1001";
		try 
		{
			Connection connect = DriverManager.getConnection(url);
			Statement statement2 = connect.createStatement();
			ResultSet rs = statement2.executeQuery(query);
			boolean status = rs.next();
			if (status) 
			{
				System.out.println("Record is Present.");
				int rollNo = rs.getInt("RollNo");
				String name = rs.getString("StudentName");
				double percentage = rs.getDouble("Percentage");
				String stream = rs.getString("Stream");
				System.out.println("Roll Number : "+rollNo);
				System.out.println("Name : "+name);
				System.out.println("Percentage : "+percentage);
				System.out.println("Stream : "+stream);
			}
			else
			{
				System.out.println("No Records Found.");
				connect.close();
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
