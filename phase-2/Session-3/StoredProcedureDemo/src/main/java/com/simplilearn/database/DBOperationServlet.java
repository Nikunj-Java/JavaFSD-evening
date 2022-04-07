package com.simplilearn.database;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dbop")
public class DBOperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();

		Properties props = new Properties();

		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);

		Connection conn = DBConfig.getConnection(props);

		response.setContentType("text/html");
		out.print("<h1> database Operation </h1>");

		try {
			Statement stmt = conn.createStatement();
			stmt.execute("create database sample");

			out.print("database Created");

			stmt.execute("use sample");
			out.print("database selected and changed <br>");

			stmt.execute("drop database sample");
			out.print("database dropped<br>");

			stmt.close();
			conn.close();
			out.print("connection closed<br>");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
