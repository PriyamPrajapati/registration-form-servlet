package com.jsp.student_crud.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ContactUsController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession();

		PrintWriter printWriter = resp.getWriter();
		
		if (httpSession.getAttribute("myPassword") != null) {

			RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");

			dispatcher.forward(req, resp);
		} else {

			printWriter.write("<html><body>");

			printWriter.write("<h3 style='color:red'>Please Login Again</h3>");

			RequestDispatcher dispatcher = req.getRequestDispatcher("login-page.jsp");

			dispatcher.include(req, resp);

			printWriter.write("</body></html>");
		}
	}
	}
