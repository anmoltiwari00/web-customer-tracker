package com.luv2code.springdemo.testconnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/TestConnection")
public class TestConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = "springstudent1";
		String pass = "springstudent1";
		String url = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		try{
			PrintWriter writer = response.getWriter();
			
			writer.println("Connecting to: "+url);
			
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url, user, pass);
					
		}catch(Exception exc){
			exc.printStackTrace();
		}
		
	}

}
