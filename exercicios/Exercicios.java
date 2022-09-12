package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Coluna ");
		int coluna = sc.nextInt();
		System.out.print("Linha ");
		int linha = sc.nextInt();

		int[][] valor = new int[coluna + 1][linha + 1];

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				valor[i][j] = rand.nextInt(0, 10);
				System.out.print(valor[i][j] + " ");
			}
			System.out.println();
		}

		System.out.print("Número ");
		int num = sc.nextInt();
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				if (valor[i][j] == num) {
					System.out.println("\nPosition - \n   Column: " + (j + 1) + "\n   Line: " + (i + 1));
					if (j > 0) {
						System.out.println("Left - " + valor[i][j - 1]);

					}
					if (j + 1 < coluna) {
						System.out.println("Right - " + valor[i][j + 1]);

					}
					if (i > 0) {
						System.out.println("Up - " + valor[i - 1][j]);

					}
					if (i < coluna) {
						System.out.println("Down - " + valor[i + 1][j]);

					}
				}
			}
		}

		sc.close();
	}

}
