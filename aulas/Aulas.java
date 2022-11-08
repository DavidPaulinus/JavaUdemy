package aulas;

import java.util.ArrayList;
import java.util.List;

import aulas.entities.Product;
import aulas.util.PriceUpdate;

public class Aulas {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.forEach(x -> x.setPrice(x.getPrice()*1.1));
		
		//list.forEach(Product::nonStaticPriceUpdate);
		
		//list.forEach(Product::staticPriceUpdate);
		
		//list.forEach(new PriceUpdate());

		list.forEach(System.out::println);

	}

}
