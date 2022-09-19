package exercicios.entities;

public class Sub3 {
	private String name;
	private Double price;

	public Sub3(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Sub3() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String priceTag() {
		return name + " $ " + price;
	}

}
