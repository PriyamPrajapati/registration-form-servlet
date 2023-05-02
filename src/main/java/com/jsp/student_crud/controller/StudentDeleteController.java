package com.jsp.student_crud.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsp.student_crud.service.StudentService;

public class StudentDeleteController extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServerException,IOException, ServletException{

	int id = Integer.parseInt(req.getParameter("id"));
	
	StudentService studentService = new StudentService();
	
	int id1 = studentService.deleteStudent(id);
	
	PrintWriter printWriter = resp.getWriter();
	
	printWriter.write("<html><body>");
	
	if(id1!=0)
	{
		printWriter.write("<h1 style='color:red'>Data deleted Successfulyy</h1>");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("delete.jsp");
		
		dispatcher.include(req, resp);
		
	}else
	{
		printWriter.write("<h1 style='color:red'>Given Id Not Found in DB</h1>");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("delete.jsp");
		
		dispatcher.include(req, resp);
	}
	printWriter.write("</body></html>");
}
}