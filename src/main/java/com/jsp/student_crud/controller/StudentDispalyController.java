package com.jsp.student_crud.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsp.student_crud.dto.Student;
import com.jsp.student_crud.service.StudentService;

public class StudentDispalyController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentService studentService = new StudentService();
		
		List<Student> students=studentService.displayStudents();
		
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.write("<html><body>");
		printWriter.write("<h1>Student Data</h1>");
		printWriter.write("<table border='2'>");
		printWriter.write("<tr><th>id</th><th>name</th><th>email</th><th>phone</th><th>address</th></tr>");
		for (Student student : students) {
			
			printWriter.write("<tr><td>"+student.getStudentid()+"</td><td>"+student.getStudentname()+"</td><td>"+student.getStudentemail()+"</td><td>"+student.getStudentphone()+"</td><td>"+student.getStudentaddress()+"</td></tr>");
		}
		
		printWriter.write("</table>");
		printWriter.write("</body></html>");
	}
}

