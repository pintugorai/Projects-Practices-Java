package demo.test.dbConnectionPg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class DBTableUtillity {
	public void createTable() {
		Connection conn = null;
		Statement st = null;

		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Student", "postgres", "Independent12#");
			System.out.println("Opened database successfully");
			
			
			//st.close();
			conn.close();
			System.out.println("Database operations successfully ended");
			
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + " : " + e.getMessage());
			System.exit(0);
		}
		
	}
}

public class PracticsPGConnection1 {
	public static void main(String[] args) {
		
		new DBTableUtillity().createTable();
	}
}
