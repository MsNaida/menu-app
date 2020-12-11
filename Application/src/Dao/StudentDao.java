package Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entity.Student;


public class StudentDao {

	private Connection connection;
	
	
	private final String UPDATE_STUDENT_BY_ID = "UPDATE student SET grade = ?, studentName = ? WHERE id = ?";
	//Insert The MYSQL private Final Strings in here
	
	
	
	public StudentDao() {
		connection = DBConnection.getConnection();
	}

	
	//finish coding and setting the prepared statements

	
}
