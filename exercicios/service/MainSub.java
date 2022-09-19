package exercicios.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercicios.enums.Enums;
import exercicios.entities.Sub1;
import exercicios.entities.Sub2;

public class MainSub {
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	List<Sub2> orderItem = new ArrayList<>();

	private Date moment;
	private Enums orderStatus;
	private Sub1 client;

	public MainSub() {
		super();
	}

	public MainSub(Date moment, Enums orderStatus, Sub1 client) {
		super();
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Enums getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Enums orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Sub1 getClient() {
		return client;
	}

	public void setClient(Sub1 client) {
		this.client = client;
	}

	public List<Sub2> getOrderItem() {
		return orderItem;
	}

	public void addItem(Sub2 item) {
		orderItem.add(item);
	}

	public void removeItem(Sub2 item) {
		orderItem.remove(item);
	}

	public Double total() {
		Double total = 0d;
		for (Sub2 s : orderItem) {
			total += s.subTotal();
		}
		return total;
	}

	public String toString() {
		StringBuffer sb=new StringBuffer();
		
		sb.append("Order Moment: " + sdf.format(moment));
		sb.append("\nOrder Status: " + orderStatus);
		sb.append("\nClient: " + client);
		sb.append("\nOrder items:\n");
		for(Sub2 items:orderItem) {
			sb.append(items+"\n");
		}
		sb.append("Total Price : $ "+total());
		
		return sb.toString();
	}

}
