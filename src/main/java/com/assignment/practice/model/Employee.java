package com.assignment.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")

public class Employee {

	public Employee() {
		super();
	}
// Primary key 
	
/*the member field below is the primary key of current entity. */
/*The @GeneratedValue annotation is to configure the way of increment of the specified 
 * column(field). For example when using Mysql, you may specify auto_increment in the 
 * definition of table to make it self-incremental, and then use*/
	
@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
	private long id;

@Column(name = "username") 
	 private String username;

@Column(name = "address") 
	 private String address;
@Column(name = "degree") 
	 private String qualification;
@Column(name = "emailId")	 
	private String email;
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee(long id, String username, String address, String qualification, String email) {
		super();
		this.id = id;
		this.username = username;
		this.address = address;
		this.qualification = qualification;
		this.email = email;
	}
	 
	 
	 
}
