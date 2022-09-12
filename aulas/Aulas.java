package aulas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Aulas {

	public static void main(String[] args) {
		
		Instant ins=Instant.parse("2002-03-30T01:00:00.0Z");
		
		LocalDateTime ld0=LocalDateTime.ofInstant(ins, ZoneId.of("Portugal"));
		LocalDateTime ld1=LocalDateTime.ofInstant(ins, ZoneId.systemDefault());
		LocalDate ld2=LocalDate.ofInstant(ins, ZoneId.of("Portugal"));
		LocalDate ld3=LocalDate.ofInstant(ins, ZoneId.systemDefault());
		
		System.out.println(ld0);
		System.out.println(ld1);
		System.out.println(ld2);
		System.out.println(ld3);
		
	}

}
