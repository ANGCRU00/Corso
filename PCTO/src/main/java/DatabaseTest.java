

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseTest {
	public class TestDB {
		public static void main(String[] args) {

			String url = "jdbc:sqlite:sanmarco.db";

			try (Connection conn = DriverManager.getConnection(url)) {
				if (conn != null) {
					System.out.println("Connessione stabilita! Il file è stato creato.");
				}
			} catch (SQLException e) {
				System.out.println("Errore: " + e.getMessage());
			}
		}
	}

}
