	package eserciziPCTO;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	
	public class TestDB {
		public static void main(String[] args) {
		    String url = "jdbc:sqlite:sanmarco.db";
	
		    try (Connection conn = DriverManager.getConnection(url)) {
		        if (conn != null) {
		            System.out.println("Connessione stabilita!");
	
		            // --- BLOCCO 1: CREAZIONE TABELLA (Se non esiste) ---
		            String createTableSql = "CREATE TABLE IF NOT EXISTS studenti (" +
		                                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
		                                    "nome TEXT, " +
		                                    "ruolo TEXT" +
		                                    ");";
		            
		            Statement stmt = conn.createStatement();
		            stmt.execute(createTableSql);
		            
		            //String deleteTable = "DELETE FROM studenti";
		           // stmt.execute(deleteTable);
		            
		            
			
		            		
		            		
		            		
		            		
	
		            // --- BLOCCO 2: INSERIMENTO DATI ---
		          
		            String insertSql = "INSERT INTO studenti (nome, ruolo) VALUES ('Luca Bianchi', '5A');";
		            stmt.execute(insertSql);
		            
		            String updateTable= """
							UPDATE studenti
							SET nome= 'Pasquale',
							ruolo= 'Amministrazione'
							WHERE ID=6;
			""";
	stmt.execute(updateTable);
	
		            // --- BLOCCO 3: QUERY DI LETTURA (SELECT) ---
		            String querySql = "SELECT * FROM studenti ";
		 
		            var rs = stmt.executeQuery(querySql);
	
		            while (rs.next()) {
		                System.out.println("ID:+"+ rs.getInt("ID") +
		                " | Studente: " + rs.getString("nome") + " | Ruolo: " + rs.getString("ruolo"));
		            }
		        }
		    } catch (SQLException e) {
		        System.err.println("Errore SQL: " + e.getMessage());
		    }
		}
	}