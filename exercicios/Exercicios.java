package exercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StringBuffer sb = new StringBuffer();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\AdaumirM\\Downloads\\minhas coisas\\Programação\\eclipse\\JavaUdemy\\src\\exercicios\\summary.csv"))) {
			for (int i = 0; i < 4; i++) {

				System.out.println("Product name, price and quantity: ");
				String[] product = sc.nextLine().split(",");

				Double price = Double.parseDouble(product[1]) * Double.parseDouble(product[2]);

				sb.append(product[0] + "," + (double) price + "\n");

				bw.write(product[0] + "," + (double) price);
				bw.newLine();

			}
		} catch (IOException e) {

			System.out.println("Erro " + e.getMessage());

		}
		System.out.println(sb);

		sc.close();
	}

}
