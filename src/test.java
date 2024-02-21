import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.student.Manage.Student;
import com.student.Manage.StudentD;

import java.io.IOException;
public class test {

	public static void main(String[] args) throws IOException {
		System.out.println("::Welcome to Student Management App::");
		System.out.print("\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("\n");
			System.out.println("PRESS 1 to ADD student");
			System.out.println("PRESS 2 to Delete student");
			System.out.println("PRESS 3 to Display student");
			System.out.println("PRESS 4 to Exit student");
			int c = Integer.parseInt(br.readLine());
			if(c==1)
			{
				//add
				System.out.println("Enter Student Name :");
				String name = br.readLine();
				
				System.out.println("Enter Student phone :");
				String phone = br.readLine();
				
				System.out.println("Enter Student City :");
				String city = br.readLine();
				
				Student st = new Student(name,phone,city);
				boolean ans = StudentD.insertStudentToDB(st);
				if(ans) {
					System.out.println("Student ADDED Succesfully...!");
				}else {System.out.println("Something is Wrong !! Try Again...");}
				
			}
			else if(c==2) 
			{
				//delete
				System.out.println("Enter the StudentID to DELETE :");
				int userID = Integer.parseInt(br.readLine());
				boolean f =StudentD.deleteStudent(userID);
				if (f) {
					System.out.println("Student DELETED Succesfully...!");
				}else {System.out.println("Something is Wrong !! Try Again...");}
			}
			else if(c==3)
			{
				//display
				StudentD.showAllStudents();
			}
			else if(c==4)  
			{
				// exit
				break;
			}
			else 
			{
				
			}
			
			
		}
		
		System.out.println("Thank you ! For Using my application");
		//System.out.println("\n");
	}
}

	
