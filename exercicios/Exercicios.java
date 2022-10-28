package exercicios;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import exercicios.entities.Sub1;
import exercicios.entities.Sub2;
import exercicios.service.MainSub;
import exercicios.service.Sub;

public class Exercicios {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Enter the contract data:");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		
		System.out.print("Date(dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(),dtf);
		
		System.out.print("Contract value: ");
		Double totalValue = sc.nextDouble();
		
		Sub1 contract=new Sub1(number,date,totalValue);
		
		System.out.print("Enter the number of installments: ");
		Integer installments = sc.nextInt();
		
		MainSub contractService = new MainSub(new Sub());
		

		System.out.println("Installments:");
		contractService.processContract(contract, installments);
		
		for(Sub2 installment:contract.getInstallments()) {
			System.out.println(installment);
		}


		sc.close();
	}

}
