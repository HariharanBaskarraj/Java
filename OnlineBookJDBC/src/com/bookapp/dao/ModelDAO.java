package com.bookapp.dao;

import java.io.*;
import java.sql.*;
import java.util.*;

public class ModelDAO {
	static Connection connection;

	public static Connection openConnection() {
		Properties properties = new Properties();
		try {
			properties.load(new FileReader("jdbc.properties"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		String url = (String) properties.get("driver");
		String username = (String) properties.get("username");
		String password = (String) properties.get("password");

		connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();;

		}
		return connection;
	}

	public static void closeConnection() {
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
