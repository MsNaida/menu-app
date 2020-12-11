package Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private final static String URL = "week12schooldb.c6enpaa8xoep.us-west-1.rds.amazonaws.com";
	private final static String USERNAME = "week12_admin";
	private final static String PASSWORD = "promineo12";
	private static Connection connection;
	private static DBConnection instance;
	
	
	@SuppressWarnings("static-access")
	private DBConnection(Connection connection) {
		this.connection = connection;
	}
			
	public static Connection getConnection() {
		if (instance == null) {
			try {
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				instance = new DBConnection(connection);
				System.out.println("Connection successful!");
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return DBConnection.connection;
	}

	
}
