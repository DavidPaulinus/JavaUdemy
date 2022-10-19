package aulas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aulas {

	public static void main(String[] args) {

		String path = "C:\\Users\\AdaumirM\\Downloads\\minhas coisas\\Programa��o\\eclipse\\JavaUdemy\\src\\Texto Teste.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path));){
			
			String line=br.readLine();
			
			while(line!= null) {
				System.out.println(line);
				line=br.readLine();
			}
			
		}catch(IOException e) {
			System.out.println("Error "+e.getMessage());
		}
		
	}

}
