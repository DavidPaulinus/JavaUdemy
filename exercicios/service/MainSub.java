package exercicios.service;

public abstract class MainSub {
	private String name;
	private Double anuaIncome;

	public MainSub(String name, Double anuaIncome) {
		super();
		this.name = name;
		this.anuaIncome = anuaIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnuaIncome() {
		return anuaIncome;
	}

	public void setAnuaIncome(Double anuaIncome) {
		this.anuaIncome = anuaIncome;
	}

	public abstract Double tax();

}
