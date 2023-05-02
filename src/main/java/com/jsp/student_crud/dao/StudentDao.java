package com.jsp.student_crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.student_crud.connection.StudentConnection;
import com.jsp.student_crud.dto.Student;

public class StudentDao {

	public Student saveStudent(Student student) {
		
		Connection connection = StudentConnection.getStdConnection();
		
		String insertStudentQuery = "insert into student value(?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertStudentQuery);
			
			preparedStatement.setInt(1, student.getStudentid());
			preparedStatement.setString(2, student.getStudentname());
			preparedStatement.setString(3, student.getStudentemail());
			preparedStatement.setLong(4, student.getStudentphone());
			preparedStatement.setString(5, student.getStudentaddress());
			
			preparedStatement.execute();
			
			return student;
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
//delete
	
	
	public int deleteStudent(int id) {
		
		Connection connection = StudentConnection.getStdConnection();
		
		String deleteStudent = "delete from student where id=?";
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(deleteStudent);
			
			preparedStatement.setInt(1,id);
			
			return preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	//updateMethod For Student
		public int updateStudent(Student student,int id) {
			
			Connection connection = StudentConnection.getStdConnection();
			
			if((student.getStudentname()!=null)&&(student.getStudentemail()!=null)
					&&(student.getStudentphone()!=0)&&(student.getStudentaddress()!=null)) 
			{
				
				String updateQuery = "update student set name=?,email=?,phone=?,address=? where id=?";
				
				PreparedStatement preparedStatement;
				try {
					preparedStatement = connection.prepareStatement(updateQuery);
					preparedStatement.setString(1, student.getStudentname());
					preparedStatement.setString(2, student.getStudentemail());
					preparedStatement.setLong(3, student.getStudentphone());
					preparedStatement.setLong(4, student.getStudentphone());
					preparedStatement.setInt(5, id);
					
					return preparedStatement.executeUpdate();
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
			}
			return 0;
		}
		
		//displayMethodForstudent
		
		public List<Student> displayStudents(){
			
			Connection connection = StudentConnection.getStdConnection();

			String displayStudentQuery = "select * from student";

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(displayStudentQuery);
				
				List<Student> students = new ArrayList<Student>();

			ResultSet resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					
				Student student = new Student();
					
				student.setStudentid(resultSet.getInt("id"));
				student.setStudentname(resultSet.getString("name"));
				student.setStudentemail(resultSet.getString("email"));
				student.setStudentphone(resultSet.getLong("phone"));
				student.setStudentaddress(resultSet.getString("address"));
					
					students.add(student);
				}
				
				return students;

			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return null;
			
		}	
   }

