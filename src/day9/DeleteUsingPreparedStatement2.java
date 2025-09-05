//accept dname from user and delete records of all emps working in that dept
package day9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteUsingPreparedStatement2 {
public static void main(String[] args) throws Exception 
{
	Connection con=MySQLDBConnectionJune.getConnection();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter dname ");
	String a=sc.next().toLowerCase();
	
	
	String query="delete from emp where dname like ?";
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1, a);
	
	
	int rows=ps.executeUpdate();
	if(rows>0)
		System.out.println(rows + " Records Deleted");
	else
		System.out.println("no record Deleted");
	
	ps.close();
	con.close();
}
}
