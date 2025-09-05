package day9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertUsingPreparedStatement {
public static void main(String[] args) throws Exception 
{
	Connection con=MySQLDBConnectionJune.getConnection();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter eno ");
	int a=sc.nextInt();
	System.out.println("Enter employee name ");
	String b=sc.next();
	System.out.println("Enter salary ");
	int c=sc.nextInt();
	System.out.println("Enter dept name ");
	String d=sc.next();
	
	String query="insert into emp values(?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(query);
	ps.setInt(1, a);
	ps.setString(2, b);
	ps.setInt(3, c);
	ps.setString(4, d);
	
	int rows=ps.executeUpdate();
	if(rows>0)
		System.out.println(rows + " Records Inserted");
	else
		System.out.println("no record inserted");
	
	ps.close();
	con.close();
}
}
