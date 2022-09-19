package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios.entities.Sub1;
import exercicios.entities.Sub2;
import exercicios.entities.Sub3;

public class Exercicios {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		List<Sub3> product=new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.println("Product #"+i+" data -");
			System.out.print("  Common, used or imported? (c,u,i) ");
			String resp=sc.next();
			
			sc.nextLine();
			System.out.print("  Name: ");
			String name=sc.nextLine();
			
			System.out.print("  Price: $ ");
			Double price=sc.nextDouble();
			
			if(resp.equalsIgnoreCase("c")) {
				product.add(new Sub3(name, price));
			}
			
			if(resp.equalsIgnoreCase("i")) {
				System.out.print("  Customs fee: $ ");
				Double custumsFee=sc.nextDouble();
				product.add(new Sub2(name, price, custumsFee));
			}
			if(resp.equalsIgnoreCase("u")) {
				System.out.print("  Manufacture date (DD/MM/YYY): ");
				String date=sc.next();
				product.add(new Sub1(name, price, sdf.parse(date)));
				
			}
			
		}
		
		System.out.println("Price tags: ");
		for(Sub3 list:product) {
			System.out.println(list.priceTag());
		}
		
		
		sc.close();
	}

}
