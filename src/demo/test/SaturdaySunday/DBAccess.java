package demo.test.SaturdaySunday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBAccess {

	public static void main(String[] args) {
		Connection c = null;
		Statement s = null;

		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Student", "postgres", "Independent12#");
			System.out.println("Successfully open database");

			// NOT WORKING
			String sqlQuery = "insert into student(id,name,role) values(2,'Test Name', 4578);";
			
			s = c.createStatement();
			s.executeQuery(sqlQuery);
			System.out.println(s.getMaxRows());
			
			s.close();
			c.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
