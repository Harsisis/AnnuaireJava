package fr.mns.jee.tp1Annuaire.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static final String URL = "jdbc:mysql://localhost:32769/db_annuaire";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	private static DatabaseConnection instance;
	private Connection conn;
	
	public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

	public DatabaseConnection() {
		try {
			this.conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConn() {
		return conn;
	}

}
