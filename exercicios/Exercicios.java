package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios.entities.Sub1;
import exercicios.entities.Sub2;
import exercicios.service.MainSub;

public class Exercicios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<MainSub> taxList=new ArrayList<>();

		Double totalTaxes = 0.0, anualIncome,healtExpenditures;
		Integer num,numberOfemployees;
		String name,resp;
		
		System.out.print("Enter the number of tax payer: ");
		num=sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Tax payer #" + i + " data -");
			System.out.print(" Individual or Company (i/c)? ");
			resp=sc.next();
			
			sc.nextLine();
			System.out.print("  Name: ");
			name=sc.nextLine();
			
			System.out.print("  Anual Income: $ ");
			anualIncome=sc.nextDouble();
			
			if (resp.equalsIgnoreCase("i")) {
				System.out.print("  Health expenditures: $ ");
				healtExpenditures=sc.nextDouble();
				
				taxList.add(new Sub1(name, anualIncome, healtExpenditures));
				
			}
			if (resp.equalsIgnoreCase("c")) {
				System.out.print("  Number of employees: ");
				numberOfemployees=sc.nextInt();
				
				taxList.add(new Sub2(name, anualIncome, numberOfemployees));
				
			}

		}

		System.out.println("\nTAXES PAID:");
		for (MainSub list : taxList) {
			totalTaxes += list.tax();
			System.out.println(list.getName() + " $ " +String.format("%.2f",list.tax()));
		}

		System.out.println("\nTOTAL TAXES: $ " + totalTaxes);

		sc.close();
	}

}
