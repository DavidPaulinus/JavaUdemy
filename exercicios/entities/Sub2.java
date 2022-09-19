package exercicios.entities;

public class Sub2 {
	private Integer quantity;
	private Double price;
	private Sub3 product;

	public Sub2() {
		super();
	}

	public Sub2(Integer quantity, Double price, Sub3 product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Sub3 getProduct() {
		return product;
	}

	public void setProduct(Sub3 product) {
		this.product = product;
	}

	public Double subTotal() {
		return price * quantity;
	}
	
	public String toString() {
		return product.getName()+", $"+price+", Quantity: "+quantity+", Subtotal: $ "+subTotal();
	}
	
}
