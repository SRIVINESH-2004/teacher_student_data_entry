package projectadmission;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class query extends input{
	public void studentconnection() 
	{
		String url = "jdbc:mysql://localhost:3306/project";
		String username = "root";
		String password = "20032004@Msv";
		String query = "insert into student"+"(STUDENT_NAME, STUDENT_AGE, MOBILE_NUMBER, PLACE, MARK, COURSE_JOINNING)"+"values(?,?,?,?,?,?)";
		Connection con;
		try {
		con =DriverManager.getConnection(url,username,password);
		PreparedStatement ps= con.prepareStatement(query);
		ps.setString(1,student_name);
		ps.setInt(2,student_age);
		ps.setString(3,mobile_number);
		ps.setString(4,place);
		ps.setInt(5, mark);
		ps.setString(6,course_joinning);
		ps.executeUpdate();
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
}
	public void teacherconnection()
	{
		String url = "jdbc:mysql://localhost:3306/project";
		String username = "root";
		String password = "20032004@Msv";
		String query = "insert into teacher"+"(TEACHER_NAME, TEACHER_AGE, YEAR_OF_EXPERIANCE, COURSE_INTREST)" +"values(?,?,?,?)";
		Connection con;
		try {
			con = DriverManager.getConnection(url,username,password);
			PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1,teacher_name);
			ps.setInt(2,teacher_age);
			ps.setInt(3,year_of_experiance);
			ps.setString(4,course_intrest);
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
