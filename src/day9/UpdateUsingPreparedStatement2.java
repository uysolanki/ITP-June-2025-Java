//accept eno and increment amount from user and increase the sal of that emp by that amount
package day9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateUsingPreparedStatement2 {
public static void main(String[] args) throws Exception 
{
	Connection con=MySQLDBConnectionJune.getConnection();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter eno ");
	int a=sc.nextInt();
	
	System.out.println("Enter increment amount ");
	int b=sc.nextInt();
	
	String query="update emp set sal=sal+? where eno=?";
	PreparedStatement ps=con.prepareStatement(query);
	ps.setInt(1, b);
	ps.setInt(2, a);
	
	
	int rows=ps.executeUpdate();
	if(rows>0)
		System.out.println(rows + " Records Updated");
	else
		System.out.println("no record Updated");
	
	ps.close();
	con.close();
}
}
