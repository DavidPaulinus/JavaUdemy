package exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		System.out.print("How many students for course A? ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			a.add(sc.nextInt());
		}

		System.out.print("How many students for course B? ");
		num = sc.nextInt();
		
		Set<Integer> b = new HashSet<>();		
		for (int i = 0; i < num; i++) {
			b.add(sc.nextInt());
		}

		System.out.print("How many students for course C? ");
		num = sc.nextInt();
		
		Set<Integer> c = new HashSet<>();	
		for (int i = 0; i < num; i++) {
			c.add(sc.nextInt());
		}

		Set<Integer> list = new HashSet<>(a);
		list.addAll(b);
		list.addAll(c);
		
		System.out.println("Total students: " + list.size());
		

		sc.close();
	}

}
