package aulas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import aulas.entities.Product;

public class Aulas {

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double min = 100.0;
		
		Predicate<Product> pred = x -> x.getPrice() >= min;

		list.removeIf(pred);

		// list.removeIf(Product::nonStaticProductPredicate);

		// list.removeIf(Product::staticProductPredicate);

		// list.removeIf(new ProductPredicate());

		// list.removeIf(p -> p.getPrice() >= 100);

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
