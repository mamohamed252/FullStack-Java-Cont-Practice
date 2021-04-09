package com.week9FinalSetup.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="getEmployeeByName", query="SELECT e FROM Employee e WHERE e.name= :empName")//JPQL
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	@Basic
	private String name, country, email;

	// none arguments constructor
	public Employee() {
		super();
	}

	// data base insert constructor
	public Employee(String name, String email, String country) {
		super();
		this.name = name;
		this.country = country;
		this.email = email;
	}

	// all fields constructor
	public Employee(int id, String name, String email, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.email = email;
	}
	// getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	// to string

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", country=" + country + ", email=" + email + "]";
	}

}
