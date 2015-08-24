package com.ds2;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
	private static DBUtils object;
	private Connection connection;

	private DBUtils() {

	}

	public static DBUtils getInstanct() {
		if (object == null) {
			object = new DBUtils();
		}

		return object;
	}

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://10.10.10.100/DS2?user=web&password=admin");
		} catch (Exception e) {

		}

		return connection;
	}

}
