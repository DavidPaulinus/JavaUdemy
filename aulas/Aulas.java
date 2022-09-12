package aulas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aulas {

	public static void main(String[] args) {
		
		LocalDate ld1=LocalDate.parse("2003-09-26");
		System.out.println(ld1);
		
		DateTimeFormatter ldf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(ld1.format(ldf));
		System.out.println(ldf.format(ld1));
		System.out.println(ld1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		DateTimeFormatter ldf2=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		Instant ins=Instant.now();
		
		System.out.println(ldf2.format(ins));
		
	}

}
