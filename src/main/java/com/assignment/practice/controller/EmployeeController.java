package com.assignment.practice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.practice.model.Employee;
import com.assignment.practice.service.EmployeeServiceInterface;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeServiceInterface empService;
	
	@GetMapping("/emps")
	public List<Employee> getemps()
	{
		return empService.getEmps();
	}
	
	/*
	 *  @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", employeeService.getAllEmployees());
        return "index";
    }
    */
	
	
	
	@GetMapping("/emps/{id}")
	public Employee getemp(@PathVariable long id)
	{
		
		Employee e=empService.getEmpById(id);
		
		if(e!=null)
			return e;
		else
		{
			System.out.println("Please Enter Valid id");
			return null;
		}
	}
	/*
	 public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
 
 // get employee from the service
 Employee employee = employeeService.getEmployeeById(id);
 
	return employee;

}
*/
	
	
	@PostMapping("/add")
	public String AddEmp(@RequestBody Employee emp) {
		empService.addEmp(emp);
		return ("Added Successfully");
	}
	/*
	   @PostMapping("/saveEmployee")
 public String saveEmployee(@ModelAttribute("employee") Employee employee) {
     // save employee to database
     employeeService.saveEmployee(employee);
     return ("Added Successfully");
 }
	 * */
	
	
	
	
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee e)
	{
		empService.updateEmp(e);
		 
		
		return ("updation Success");
	}
	
	
	@DeleteMapping("emps/{id}")
	public String deleteEmp(@PathVariable long id)
	{
		empService.deleteEmp(id);
		return("deleted");
	}
	/* @GetMapping("/deleteEmployee/{id}")
public String deleteEmployee(@PathVariable (value = "id") long id) {
 
 // call delete employee method 
 this.employeeService.deleteEmployeeById(id);
 return("deleted");
}
*/
	
	
	
	
}
