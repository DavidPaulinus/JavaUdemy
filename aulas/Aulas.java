package aulas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import aulas.entities.entitie;
import aulas.entities.contract.HourContract;
import aulas.entities.enums.Enums;
import aulas.entities.worker.Worker;

public class Aulas {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		HourContract HC;

		String name, depart, level;
		Double salary;

		System.out.print("Enter departament's name: ");
		depart = sc.nextLine();
		System.out.println("Enter worker data - ");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Level: ");
		level = sc.next();
		System.out.print("Base salary: ");
		salary = sc.nextDouble();

		Worker worker = new Worker(name, Enums.valueOf(level.toUpperCase()), salary, new entitie(depart));

		System.out.print("How many contracts to this worker? ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			HC = new HourContract();

			System.out.println("\nEnter contract #" + i + " data - ");

			System.out.print("Date (DD/MM/YYYY): ");
			String data = sc.next();
			HC.setDate(sdf.parse(data));

			System.out.print("Value per hour: ");
			Double value = sc.nextDouble();
			HC.setValuePerHour(value);

			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();
			HC.setHour(hours);

			worker.addContract(HC);
		}

		System.out.print("\nEnter month and year to calculate income (MM/YYYY) ");
		String monthYear = sc.next();
		String[] DM = monthYear.split("/");
		Integer mm = Integer.parseInt(DM[0]);
		Integer yy = Integer.parseInt(DM[1]);

		System.out.println("Name: " + worker.getName());
		System.out.println("Departmant: " + worker.getDepartmant().getNameDepartment());
		System.out.println("Income for " + monthYear + ": " + worker.income(yy, mm));

		sc.close();
	}

}
