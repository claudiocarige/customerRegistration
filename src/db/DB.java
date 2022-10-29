package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {
	
	private static Connection conn = null;
	
	public static Connection getConnection() {
		try {
			Properties properties = loadProperties();
			String url = properties.getProperty("dburl");
			conn = DriverManager.getConnection(url, properties);
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		return conn;
	}
	
	private static Properties loadProperties(){
		
		try (FileInputStream file = new FileInputStream("db.properties")){
			
			Properties properties = new Properties();
			properties.load(file);
			return properties;
			
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}

	public static void closeStatment(Statement st) {
		if(st != null) {
			try {
			st.close();
			}catch (Exception e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	public static void closeResutSet(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
}
