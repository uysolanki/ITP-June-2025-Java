package day9;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingStatement {

	public static void main(String[] args) throws Exception
	{
		Connection con=MySQLDBConnectionJune.getConnection();
		
		Statement st=con.createStatement();
		String query1="insert into emp values(2,'Ben',900,'IT')";
		String query2="insert into emp values(3,'Chris',600,'Sales')";
		String query3="insert into emp values(4,'David',1200,'Sales')";
		String query4="insert into emp values(5,'Elcid',800,'Mark')";
		String query5="insert into emp values(6,'Frank',1100,'Mark')";
		
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		st.addBatch(query4);
		st.addBatch(query5);


		try
		{
		int rows[]=st.executeBatch();
		
		if(rows.length>0)
			System.out.println(rows.length + " Records Inserted");
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
