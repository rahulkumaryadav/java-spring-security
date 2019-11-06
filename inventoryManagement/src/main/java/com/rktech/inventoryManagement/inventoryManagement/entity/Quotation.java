package com.rktech.inventoryManagement.inventoryManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Quotation")
public class Quotation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long rate;
	
	
	/*
	 * @OneToOne private Home home;
	 */
	
	public Quotation() {}
	
	public Quotation(Long id, Long rate) {
		this.id = id;
		this.rate = rate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRate() {
		return rate;
	}

	public void setRate(Long rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Quotation [id=" + id + ", rate=" + rate + ", getId()=" + getId() + ", getRate()=" + getRate()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
