package aulas;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aulas {

	public static void main(String[] args) {

		File file = new File(
				"C:\\Users\\AdaumirM\\Downloads\\minhas coisas\\Programação\\eclipse\\JavaUdemy\\src\\Texto Teste.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());

		} finally {
			if (sc != null) {
				sc.close();

			}
		}

	}

}
