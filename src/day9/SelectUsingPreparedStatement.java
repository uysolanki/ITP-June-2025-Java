package day9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectUsingPreparedStatement {

	public static void main(String[] args) throws Exception 
	{
		Connection con=MySQLDBConnectionJune.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dept name ");
		String d=sc.next();
		
		String query="select sal,ename from emp where dname like ?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, d);
		
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			//System.out.println(rs.getString(1) + " " + rs.getInt(2));
			System.out.println(rs.getString("ename") + " " + rs.getInt("sal"));
		}
		
		rs.close();
		ps.close();
		con.close();
	}

}
