package Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entity.Teacher;


public class TeacherDao {
	
	private Connection connection;
	
	//Insert The MYSQL private Final Strings in here
	
	
	public TeacherDao() {
		connection = DBConnection.getConnection();
	}
	
	
	//finish coding and setting the prepared statements
	
}
