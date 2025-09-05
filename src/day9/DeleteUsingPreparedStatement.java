//accept eno from user ans delete that record
package day9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteUsingPreparedStatement {
public static void main(String[] args) throws Exception 
{
	Connection con=MySQLDBConnectionJune.getConnection();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter eno ");
	int a=sc.nextInt();
	
	
	String query="delete from emp where eno=?";
	PreparedStatement ps=con.prepareStatement(query);
	ps.setInt(1, a);
	
	
	int rows=ps.executeUpdate();
	if(rows>0)
		System.out.println(rows + " Records Deleted");
	else
		System.out.println("no record Deleted");
	
	ps.close();
	con.close();
}
}
