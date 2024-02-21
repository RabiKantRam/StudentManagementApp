package com.student.Manage;
import java.sql.*;
public class ConProv {
	 static Connection con; 
	 public static  Connection CreateC() {
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 //create connection
			 String user = "root";
			 String password = "1519";
			 String url = "jdbc:mysql://localhost:3306/student_db";
			 con=DriverManager.getConnection(url,user,password);
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
		 return con;
	
	 }

}
