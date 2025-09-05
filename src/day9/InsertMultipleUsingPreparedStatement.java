package day9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMultipleUsingPreparedStatement {
public static void main(String[] args) throws Exception 
{
	Connection con=MySQLDBConnectionJune.getConnection();
	Scanner sc=new Scanner(System.in);
	
	String query="insert into emp values(?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(query);
	
	for(int i=1;i<=3;i++)
	{
	System.out.println("Enter eno ");
	int a=sc.nextInt();
	System.out.println("Enter employee name ");
	String b=sc.next();
	System.out.println("Enter salary ");
	int c=sc.nextInt();
	System.out.println("Enter dept name ");
	String d=sc.next();
	
	
	ps.setInt(1, a);
	ps.setString(2, b);
	ps.setInt(3, c);
	ps.setString(4, d);
	ps.addBatch();
	}
	
	int rows[]=ps.executeBatch();
	if(rows.length>0)
		System.out.println(rows.length + " Records Inserted");
	else
		System.out.println("no record inserted");
	
	ps.close();
	con.close();
}
}
