package exercicios.entities;

import exercicios.service.MainSub;

public class Sub1 extends MainSub {
	private Double healtExpenditures;

	public Sub1(String name, Double anuaIncome, Double healtExpenditures) {
		super(name, anuaIncome);
		this.healtExpenditures = healtExpenditures;
	}

	@Override
	public Double tax() {
		Double tax = 0.0;
		if (super.getAnuaIncome() < 20000.00) {
			tax = super.getAnuaIncome() * 0.15 - healtExpenditures * 0.5;
		}
		if (super.getAnuaIncome() >= 20000.00) {
			tax = super.getAnuaIncome() * 0.25 - healtExpenditures * 0.5;
		}

		return tax;

	}

}
