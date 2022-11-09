package aulas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import aulas.entities.Product;

public class Aulas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String path = "C:\\Users\\AdaumirM\\Downloads\\minhas coisas\\Programação\\eclipse\\JavaUdemy\\src\\Texto Teste.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Product> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] prod = line.split(",");
				list.add(new Product(prod[0], Double.parseDouble(prod[1])));

				line = br.readLine();
			}

			Double avg = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x, y) -> x + y) / list.size();

			System.out.println("Average Price: $ " + avg);
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			List<String>name = list.stream()
					.filter(x -> x.getPrice() <= avg)
					.map(x -> x.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			
			name.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}

		sc.close();
	}

}
