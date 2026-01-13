package corsojava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_R_W {
	public static void main(String[] args) {
		String nomeFile = "C:\\Users\\angcru\\Desktop\\nuovofile.txt";
        String contenuto = "Ciao, questo è un esempio di testo scritto in un file Java.";
		String fileName = "C:\\Users\\angcru\\Desktop\\Ciao Ragazzi.txt";
		BufferedReader reader = null;
		
		try (FileWriter writer1 = new FileWriter(nomeFile)) {
            writer1.write(contenuto);
            System.out.println("File creato e scritto con successo!");
        } catch (IOException e) {
            System.err.println("Si è verificato un errore durante la creazione/scrittura del file.");
            e.printStackTrace();
        }
		
		
		try {

			reader = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {

			System.err.println("Non trovo il file: " + e.getMessage());
		} finally {

			try {
					if (reader != null) {
						reader.close();
					System.out.println("Lettore file chiuso.");
				}
			} catch (IOException e) {
				System.err.println("Errore nella chiusura del file: " + e.getMessage());
			}
		}

		String content = "Questo è il primo riga.\n";
		content += "Questa è la seconda riga.\n";
		content += "E questa è l'ultima riga.";
		content += "E questa è l'ultima riga.";

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(fileName, false));
			writer.write(content);
			System.out.println("Scrittura del file completata con successo.");
		} catch (IOException e) {
			System.err.println("Si è verificato un errore durante la scrittura del file: " + e.getMessage());
		} finally {

			try {
				if (writer != null) {
					writer.close();
					System.out.println("Scrittore file chiuso.");
				}
			} catch (IOException e) {
				System.err.println("Errore nella chiusura del file: " + e.getMessage());
			}
		}
		  

	        
	        
	    }
	}
	
