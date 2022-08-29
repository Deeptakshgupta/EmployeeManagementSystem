package com.assignment.practice.service;

import java.util.List;

//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;

import com.assignment.practice.model.Employee;


public interface EmployeeServiceInterface {
//create
	public void addEmp(Employee e); 
//Read
	public List<Employee> getEmps();
//Read by id	
	public Employee getEmpById(long id);
//update
//@Modifying
//@Query("UPDATE employee e SET e.id = '2', e.address = ?3, e.email_id = ?5, e.degree = ?4, e.username = ?2 ")
	public void updateEmp(Employee emp);
//delete
	public void deleteEmp(long id);
}
