package exercicios.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sub1 extends Sub3 {
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public Sub1(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return super.getName() + " (used) $ " + super.getPrice() + " (Manufacture date: " + sdf.format(manufactureDate);
	}
}
