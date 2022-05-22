package com.javatechie.spring.mysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

	@Id
	@GeneratedValue
	private int id;
	private double amount;
	private String catagory;
	
	
	
	public Ticket() {
		
	}
	
	
	
	public Ticket(int id, double amount, String catagory) {
		
		this.id = id;
		this.amount = amount;
		this.catagory = catagory;
	}



	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", amount=" + amount + ", catagory=" + catagory + "]";
	}
	
	
	

}
