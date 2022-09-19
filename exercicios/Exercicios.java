package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exercicios.entities.Sub1;
import exercicios.entities.Sub2;
import exercicios.entities.Sub3;
import exercicios.enums.Enums;
import exercicios.service.MainSub;

public class Exercicios {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		MainSub order;
		Sub1 client=new Sub1();
		Sub2 orderItem;

		String name, email, status, data;
		Integer quantity, num;
		Double price;

		System.out.println("Enter client data -");
		System.out.print("   Name: ");
		name = sc.nextLine();
		client.setName(name);
		System.out.print("   E-mail: ");
		email = sc.next();
		client.setEmail(email);
		System.out.print("   Birth Date (DD/MM/YYYY): ");
		data = sc.next();
		client.setBirthDate(sdf.parse(data));

		System.out.println("Enter processing data -");
		System.out.print("   Status: ");
		status = sc.next();
		System.out.print("   How many items to this order? ");
		num = sc.nextInt();

		order = new MainSub(new Date(), Enums.valueOf(status.toUpperCase()), client);

		for (int i = 1; i <= num; i++) {
			orderItem = new Sub2();
			
			sc.nextLine();
			System.out.println("Enter #" + i + " item data -");
			System.out.print("  Product name: ");
			name = sc.nextLine();
			
			System.out.print("  Product price: $ ");
			price = sc.nextDouble();
			orderItem.setPrice(price);
			
			System.out.print("  Quantity: ");
			quantity = sc.nextInt();
			orderItem.setQuantity(quantity);
			
			Sub3 product=new Sub3(name,price);
			
			orderItem.setProduct(product);
			
			order.addItem(orderItem);
		}

		System.out.println("Order sumary -");
		System.out.println(order);

		sc.close();
	}

}
