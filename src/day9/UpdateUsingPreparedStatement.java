//accept dname and increase the sal of that dept by 10%
package day9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateUsingPreparedStatement {
public static void main(String[] args) throws Exception 
{
	Connection con=MySQLDBConnectionJune.getConnection();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter dept name ");
	String a=sc.next().toLowerCase();
	
	String query="update emp set sal=sal+0.1*sal where dname=?";
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1, a);
	
	
	int rows=ps.executeUpdate();
	if(rows>0)
		System.out.println(rows + " Records Updated");
	else
		System.out.println("no record Updated");
	
	ps.close();
	con.close();
}
}
