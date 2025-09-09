package day9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectUsingStatement {

	public static void main(String[] args) throws Exception 
	{
		Connection con=MySQLDBConnectionJune.getConnection();
		
		Statement st=con.createStatement();

		String query="select sal,ename from emp where dname like 'Sales'";
		
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			//System.out.println(rs.getString(1) + " " + rs.getInt(2));
			System.out.println(rs.getString("ename") + " " + rs.getInt("sal"));
		}
		
		rs.close();
		st.close();
		con.close();
	}

}
