package exercicios.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sub2 {
	
	
	//installment
	LocalDate dueDate;
	Double amount;
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Sub2() {
	}

	public Sub2(LocalDate dueDate, Double amount) {
		super();
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return dueDate.format(dtf) + " - " + String.format("%.2f", amount);
	}
	
	

}
