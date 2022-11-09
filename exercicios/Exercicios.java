package exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import exercicios.entities.Employee;

public class Exercicios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String path = "C:\\Users\\AdaumirM\\Downloads\\minhas coisas\\Programação\\eclipse\\JavaUdemy\\src\\Texto Teste.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Employee> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] employee = line.split(",");
				list.add(new Employee(employee[0], employee[1], Double.parseDouble(employee[2])));

				line = br.readLine();
			}

			System.out.print("Enter salary: ");
			Double salary = sc.nextDouble();


			List<String> emails = list.stream().filter(x -> x.getSalary() > salary).map(p -> p.getEmail()).sorted((s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase())).collect(Collectors.toList());

			Double sum = list.stream().filter(x -> x.getName().charAt(0) == 'M').map(x -> x.getSalary()).reduce(0d, (x,y) -> x + y);
			
			System.out.println("Email of people whose salary is more than $" + salary);
			emails.forEach(System.out::println);
			
			System.out.println("Sum of salary of people whose name starts with 'M': "+String.format("%.2f", sum));

		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		
		sc.close();
	}

}
