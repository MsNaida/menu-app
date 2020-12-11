package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entity.Class;

public class ClassDao {

	private Connection connection;
	
	//Insert The MYSQL private Final Strings in here
	private final String UPDATE_CLASS_BY_ID = "UPDATE class SET  className = ? WHERE id = ?";
	
	public ClassDao() {
		connection = DBConnection.getConnection();
	}

	
	//finish coding and setting the prepared statements
	public void updateClassById (int id, String className) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(UPDATE_CLASS_BY_ID);
		ps.setString(1, className);
		ps.setInt(2, id);
		ps.executeUpdate();
	}	
	
}
