package exercicios;

import java.util.Scanner;

import exercicios.service.MainSub;

public class Exercicios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String holder;
		Integer number;
		Double balance, withdraw, amount;

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			number = sc.nextInt();

			sc.nextLine();
			System.out.print("Holder: ");
			holder = sc.nextLine();

			System.out.print("Balance: $ ");
			balance = sc.nextDouble();

			System.out.print("Withdraw Limit: $ ");
			withdraw = sc.nextDouble();

			MainSub account = new MainSub(holder, number, withdraw);
			account.deposit(balance);

			System.out.print("\nEnter amount for withdraw: $ ");
			amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.println("New balance: $ " + account.getBalance());

		} catch (Exception e) {
			System.out.println("Withdraw error: " + e.getMessage());

		}

		sc.close();
	}

}
