package org.jspiders.jdbcprogram;

import java.sql.*;

public class DeleteDataFromTable 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=Litish17@";
		String query = "delete from litishdatabase.student where RollNo=1011";
		try 
		{
			Connection connect = DriverManager.getConnection(url);
			Statement statement2 = connect.createStatement();
			int noOfRecords = statement2.executeUpdate(query);
			System.out.println("Number of Records Deleted is : "+noOfRecords);
			if (noOfRecords>0) 
			{
				System.out.println("Record Deleted.");
			}
			else
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
