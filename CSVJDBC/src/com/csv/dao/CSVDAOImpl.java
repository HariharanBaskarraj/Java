package com.csv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.csv.bean.Employee;

public class CSVDAOImpl implements CSVDAO {
	public void save(Employee employee) {

		try {
			PreparedStatement statement = null;
			Connection connection = ModelDAO.openConnection();
			statement = connection.prepareStatement("INSERT INTO EMPLOYEES VALUES(?,?,?);");
			statement.setString(1, employee.getName());
			statement.setString(2, employee.getCity());
			statement.setDouble(3, employee.getSalary());
			statement.execute();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ModelDAO.closeConnection();
		}
	}
}
