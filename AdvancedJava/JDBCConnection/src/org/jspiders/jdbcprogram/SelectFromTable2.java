package org.jspiders.jdbcprogram;

import java.sql.*;

public class SelectFromTable2 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=Litish17@";
		String query = "select * from litishdatabase.student where Percentage<=90.0";
		try 
		{
			Connection connect = DriverManager.getConnection(url);
			Statement statement2 = connect.createStatement();
			ResultSet rs = statement2.executeQuery(query);
			int count = 0;
			while (rs.next())
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
				System.out.println("********************************");
				count++;
			}
			if (count==0)
			{
				System.out.println("No Records Found.");
			}
			connect.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
