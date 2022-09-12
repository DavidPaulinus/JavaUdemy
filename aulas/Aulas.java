package aulas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Aulas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate ld1 = LocalDate.now();
		LocalDateTime ld2 = LocalDateTime.now();
		Instant ld3 = Instant.now();

		LocalDate ld4 = LocalDate.parse("2002-03-15");
		Instant ld5 = Instant.parse("2002-03-15T01:30:00.0Z");
		Instant ld6 = Instant.parse("2002-03-15T01:30:00.0-03:00");
		LocalDate ld7 = LocalDate.parse("26/09/2003", dtf);
		LocalDate ld8 = LocalDate.parse("26/09/2053", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		System.out.println("LocalDate        " + ld1);
		System.out.println("LocalDateTime    " + ld2);
		System.out.println("Instant          " + ld3); // London time
		System.out.println("LocalDate String " + ld4);
		System.out.println("Instant          " + ld5);
		System.out.println("Instant          " + ld6);
		System.out.println("LocalDate        " + ld7);
		System.out.println("LocalDate        " + ld8);

		sc.close();
	}

}
