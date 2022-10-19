package aulas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aulas {

	public static void main(String[] args) {

		String path = "C:\\Users\\AdaumirM\\Downloads\\minhas coisas\\Programação\\eclipse\\JavaUdemy\\src\\Texto Teste.txt";

		String[] lines = new String[] { "Sup ma' man", "Listenig to Lil Peep, hun?", "\n", "Good good" };

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}

		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}

	}

}
