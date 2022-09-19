package exercicios.entities;

public class Sub2 extends Sub3 {
	private Double custumsFee;

	public Sub2(String name, Double price, Double custumsFee) {
		super(name, price);
		this.custumsFee=custumsFee;
	}

	public Double totalPrice() {
		return super.getPrice() + custumsFee;
	}

	@Override
	public String priceTag() {
		return super.getName()+" $ "+ totalPrice()+ " (Customs fee: $ " +custumsFee  + ")";
	}
}
