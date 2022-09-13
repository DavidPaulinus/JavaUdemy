package aulas.entities.worker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import aulas.entities.entitie;
import aulas.entities.contract.HourContract;
import aulas.entities.enums.Enums;

public class Worker {
	List<HourContract> contracts = new ArrayList<>();;

	private String name;
	private Enums level;
	private Double baseSalary;
	private entitie departmant;

	public Worker() {
		super();
	}

	public Worker(String name, Enums level, Double baseSalary, entitie departmant) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departmant = departmant;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Enums getLevel() {
		return level;
	}

	public void setLevel(Enums level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public entitie getDepartmant() {
		return departmant;
	}

	public void setDepartmant(entitie departmant) {
		this.departmant = departmant;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract hc) {
		contracts.add(hc);
	}

	public void removeContract(HourContract hc) {
		contracts.remove(hc);
	}

	public Double income(Integer year, Integer month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();

		for (HourContract c : contracts) {

			cal.setTime(c.getDate());

			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);

			if (c_year == year && c_month == month) {
				sum += c.totalValue();
			}
		}

		return sum;
	}
}
