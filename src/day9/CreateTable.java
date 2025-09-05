package day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String dbUrl="jdbc:mysql://localhost:3306/junedb";
		String dbUsername="root";
		String dbPassword="";
		
		Connection con=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		
		Statement st=con.createStatement();
		
		String query="create table emp(\r\n"
				+ "eno int(5) primary key,\r\n"
				+ "ename varchar(10),\r\n"
				+ "sal int(5),\r\n"
				+ "dname varchar(10))";
		
		st.execute(query);
		
		System.out.println("Table Created");
		
		st.close();
		con.close();

	}

}
