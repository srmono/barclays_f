package com.barclays.db;

import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;

public class DatabaseDemo {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/emp";
		String uname = "root";
		String pass = "password";
		String query = "select * from employees";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			String empData = rs.getInt(1) + ":" + rs.getString(2);
			System.out.println(empData);
		}

		st.close();
		con.close();

	}
}
