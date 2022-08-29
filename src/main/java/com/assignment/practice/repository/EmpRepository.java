package com.assignment.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.practice.model.Employee;



@Repository
public interface EmpRepository extends JpaRepository<Employee, Long>{
	 
}

