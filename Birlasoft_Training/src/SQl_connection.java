

import java.sql.*;
public class SQl_connection
{
public static void main(String[] args) throws Exception
{
Connection conn;
try
{
Class.forName("com.mysql.cj.jdbc.Driver");

conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Root");
System.out.println("Connected with database Sucessfully");

Statement stmt = conn.createStatement();
//int result = stmt.executeUpdate("insert into employee  values('3','Kunal', '123456789')");

/*
if (result > 0) {
      System.out.println("successfully inserted");
}
  else {
      System.out.println("unsucessful insertion ");
}
*/
conn.setAutoCommit(false);

String insert1="insert into employee values('aditya',33000,'birlasoft',23)";
String insert2="insert into employee values('rahul',12000,'wipro',22)";
String insert3="insert into employee values('ram',25000,'mahindra',24)";
String insert4="insert into employee values('saurabh',13000,'infosys',21)";
String insert5="insert into employee values('pranav',23000,'global',25)";
}

catch(Exception c)
{
	c.printStackTrace();
System.out.println("Error while connecting databas");
}
// TODO Auto-generated method stub

}

}