package exercicios.entities;

import exercicios.service.MainSub;

public class Sub2 extends MainSub {
	private Integer numberOfemployees;

	public Sub2(String name, Double anuaIncome, Integer numberOfemployees) {
		super(name, anuaIncome);
		this.numberOfemployees = numberOfemployees;
	}

	@Override
	public Double tax() {
		Double tax = 0.0;

		if (numberOfemployees < 11) {
			tax = super.getAnuaIncome() * 0.16;
		}
		if (numberOfemployees > 10) {
			tax = super.getAnuaIncome() * 0.14;
		}

		return tax;
	}

}
