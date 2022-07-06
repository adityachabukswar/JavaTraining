

import java.sql.*;

public class Demo30 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		  
		Connection conn;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test123", "root", "");//Establishing connection
			System.out.println("Connected With the database successfully");
			
		
			 Statement stmt = conn.createStatement();
			 int result = stmt.executeUpdate("insert into emp(ID,NAME,address) values('3','Kunal','mumbai')");
			  
			 
		
		} 
		catch (SQLException e) {
			System.out.println("Error while connecting to the database");
			} 

        
	}
}