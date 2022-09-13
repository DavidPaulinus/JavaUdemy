package aulas;

import java.util.Date;
import java.util.Scanner;

import entities.Order;
import entities.enums.Enums;

public class Aulas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		Order order=new Order(40028922,new Date(),Enums.PENDING_PAYMENT);
		
		System.out.println(order);
		
		
		Enums orderStatus=Enums.DELIVERED;
		
		String resp=sc.next();
		
		Enums orderStatus2=Enums.valueOf(resp.toUpperCase());
		
		System.out.println(orderStatus2);
		
	}

}
