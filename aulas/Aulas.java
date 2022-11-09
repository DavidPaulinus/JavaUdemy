package aulas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import aulas.entities.Product;
import aulas.util.ProductService;

public class Aulas {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		List<Integer> listint = Arrays.asList(1, 2, 3, 4, 5);

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		ProductService ps = new ProductService();
		System.out.println(Arrays.toString(list.toArray()));

		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		System.out.println("Sum = " + String.format("%.2f", sum));

		Stream<Product> str = list.stream();
		Stream<Integer> str1 = listint.stream().map(x -> x + 3);

		System.out.println(Arrays.toString(str.toArray()));
		System.out.println(Arrays.toString(str1.toArray()));

		Stream<String> str2 = Stream.of("José", "Maria");

		Stream<Integer> str3 = Stream.iterate(0, x -> x + 2);

		System.out.println(Arrays.toString(str3.limit(11).toArray()));

	}

}
