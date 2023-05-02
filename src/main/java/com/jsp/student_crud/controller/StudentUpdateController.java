package com.jsp.student_crud.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsp.student_crud.dto.Student;
import com.jsp.student_crud.service.StudentService;

public class StudentUpdateController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		long phone  = Long.parseLong(req.getParameter("phone"));
	    String address = req.getParameter("address");
		
		PrintWriter printWriter = resp.getWriter();
		
		Student student = new Student();
		
		student.setStudentname(name);
		student.setStudentemail(email);
		student.setStudentphone(phone);
		student.setStudentaddress(email);
		
		StudentService studentService = new StudentService();
		
		studentService.updateStudent(student,id);
		
		printWriter.write("<html><body>");
		printWriter.write("<h1 style='color:green'>Data updated Successfully</h1>");
		RequestDispatcher dispatcher = req.getRequestDispatcher("update.jsp");
		dispatcher.include(req, resp);
		printWriter.write("</body></html>");
	}

}
