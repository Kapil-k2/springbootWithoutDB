package com.boot.first.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String streetName;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public Address(String streetName) {
		super();
		this.streetName = streetName;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", streetName=" + streetName + "]";
	}
	
}
