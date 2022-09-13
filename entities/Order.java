package entities;

import java.util.Date;

import entities.enums.Enums;

public class Order {
	private Integer id;
	private Date data;
	private Enums status;
	
	public Order() {
	}

	public Order(Integer id, Date data, Enums status) {
		this.id = id;
		this.data = data;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Enums getStatus() {
		return status;
	}

	public void setStatus(Enums status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", data=" + data + ", status=" + status + "]";
	}
	
	
	
	
}
