package com.student.Manage;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentD {

	public static boolean insertStudentToDB(Student st) {
		boolean f = false;
		//jdbc here
		try {
			Connection con = ConProv.CreateC();
			String q="insert into student(sname,sphone,scity)values(?,?,?)";//"?" is for dynamic quarry
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the values
			pstmt.setString(1,st.getStudentName());
			pstmt.setString(2,st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			//execute
			pstmt.executeUpdate();
			f=true;
		}
		catch(Exception e){
			e.getStackTrace();
		}
		return f;
		
	}

	public static boolean deleteStudent(int userID) {
		boolean f = false;
		//jdbc here
		try {
			Connection con = ConProv.CreateC();
			String q="delete from student where sid = ?";//"?" is for dynamic quarry
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the values
			pstmt.setInt(1,userID);
			//execute
			pstmt.executeUpdate();
			f=true;
		}
		catch(Exception e){
			e.getStackTrace();
		}
		return f;
		
		
	}

	public static void showAllStudents() {
		try {
			Connection con = ConProv.CreateC();
			String q="select * from student";//"?" is for dynamic quarry
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			while (set.next()) {
				int id =set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("scity");
				
				System.out.println(" ID : "+id);
				System.out.println(" Name : "+name);
				System.out.println(" Phone : "+phone);
				System.out.println(" City : "+city);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			}
		}
		catch(Exception e){
			e.getStackTrace();
		}
		
		
	}
	

}
