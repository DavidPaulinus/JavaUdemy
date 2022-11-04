package exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Exercicios {

	public static void main(String[] args) {
		Map<String, Integer> vote = new HashMap<>();

		System.out.print("Enter file full path: ");

		String path = "C:\\Users\\AdaumirM\\Downloads\\minhas coisas\\Programação\\eclipse\\JavaUdemy\\src\\Texto Teste.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] field = line.split(",");

				String name = field[0];
				Integer value = Integer.parseInt(field[1]);

				if (vote.containsKey(name)) {
					int votesSoFar = vote.get(name);
					vote.put(name, value + votesSoFar);

				} else {
					vote.put(name, value);
				}

				line = br.readLine();

			}

			for (String keys : vote.keySet()) {
				System.out.println(keys + ": " + vote.get(keys));
			}

		} catch (IOException e) {
			e.getMessage();
		}

	}

}
