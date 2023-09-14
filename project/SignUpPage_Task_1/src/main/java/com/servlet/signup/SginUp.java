package com.servlet.signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/sginup")
public class SginUp extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String fname = req.getParameter("firstname");
		String lname = req.getParameter("lastname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String cpassword = req.getParameter("confirmpassword");
		
		PrintWriter pw = res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup", "root", "root");
			PreparedStatement ps = con.prepareStatement("insert into signup values(?,?,?,?,?)");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email);
			ps.setString(4, password);
			ps.setString(5, cpassword);
			if(!(ps.execute())) {
				pw.println("<h1>Data Save Successfully!</h1>");
			} 
		} catch (ClassNotFoundException e) {
			    pw.println("<h1>JDBC Driver is not loaded Successfully!</h1>");
		} catch (SQLException e1) {
			pw.println("<h1> DataBase is not loaded Successfully!</h1>");
		}

	}

}
