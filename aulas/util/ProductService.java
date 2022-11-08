package aulas.util;

import java.util.List;
import java.util.function.Predicate;

import aulas.entities.Product;

public class ProductService {

	public Double filteredSum(List<Product> list,Predicate<Product> pred) {
		double sum = 0.0;
		for (Product pro : list) {
			if (pred.test(pro)) {
				sum += pro.getPrice();
			}
		}
		return sum;
		
	}

}
