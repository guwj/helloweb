package com.bit2016.helloweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(
		HttpServletRequest req, 
		HttpServletResponse resp) 
		throws ServletException, IOException {
		
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter pw = resp.getWriter();
		pw.println( "<h1>안녕하세요!</h1>" );
	}

	@Override
	protected void doPost(
		HttpServletRequest req, 
		HttpServletResponse resp)
		throws ServletException, IOException {
	}

}
