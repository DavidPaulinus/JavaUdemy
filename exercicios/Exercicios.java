package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import exercicios.entities.MainSub;
import exercicios.entities.Sub1;

public class Exercicios {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		MainSub p1 = new MainSub(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
				"I'm going to visit this wonderful country!", 12);

		Sub1 comm1 = new Sub1("Have a nice trip");
		Sub1 comm2 = new Sub1("Wow that's awesome!");
		p1.addComment(comm1);
		p1.addComment(comm2);

		MainSub p2 = new MainSub(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
		Sub1 comm3 = new Sub1("Good night");
		Sub1 comm4 = new Sub1("May the Force be with you");
		p2.addComment(comm3);
		p2.addComment(comm4);

		System.out.println(p1);
		System.out.println(p2);

		sc.close();
	}

}
