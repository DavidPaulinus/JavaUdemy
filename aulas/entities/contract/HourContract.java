package aulas.entities.contract;

import java.util.Date;

public class HourContract {
	private Double valuePerHour;
	private Integer hour;
	private Date date;

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double totalValue() {
		return valuePerHour * hour;
	}

}
