//update sal to 1000 and dname to Sales of Eno 2
package day9;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUsingStatement {

	public static void main(String[] args) throws Exception
	{
		Connection con=MySQLDBConnectionJune.getConnection();
		
		Statement st=con.createStatement();
		String query="update emp set sal=1000,dname='Sales' where eno=2";
		try
		{
		int rows=st.executeUpdate(query);
		
		if(rows>0)
			System.out.println(rows + " Records Updated");
		else
			throw new SQLException();
		}
		catch(SQLException e1)
		{
			System.out.println(e1.getMessage());
		}
		
		st.close();
		con.close();

	}

}
