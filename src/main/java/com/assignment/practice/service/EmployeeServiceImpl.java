package com.assignment.practice.service;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//import java.util.stream.Collectors;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.practice.model.Employee;
import com.assignment.practice.repository.EmpRepository;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {

	@Autowired 
	private EmpRepository employeeRepository;

//List<Employee> emps=new ArrayList<>();
//public EmployeeServiceImpl()
//{
//		emps.add(new Employee(1,"User1","address1","qualification1","email1"));
//		emps.add(new Employee(2,"User2","address2","qualification2","email2"));
//		emps.add(new Employee(3,"User3","address3","qualification3","email3"));
//		emps.add(new Employee(4,"User4","address4","qualification4","email4"));
//	
//}
@Override
public List<Employee> getEmps() {
	
	//return emps;
	  return employeeRepository.findAll();
}
@Override
public Employee getEmpById(long id) {

	Optional < Employee > optional = employeeRepository.findById(id);
    Employee employee = null;
    if (optional.isPresent()) {
        employee = optional.get();
    } else {
        throw new RuntimeException(" Employee not found for id :: " + id);
    }
    return employee;
	
	
	
	
//	for (Employee c:emps)
//	{
//		if(c.getId()==id)
//			{
////			System.out.println("Returned obj");
//			return c; }
//	}
//	return null;
}


@Override
public void addEmp(Employee e) {
//	emps.add(e);
	 employeeRepository.save(e);
	
}
@Override
public void updateEmp(Employee emp)  {

	 employeeRepository.save(emp);
   
	
}
	
//	for(Employee em: emps) {
//		if(em.getId()==emp.getId())
//		{
//			em.setUsername(emp.getUsername());
//			em.setAddress(emp.getAddress());
//			em.setQualification(emp.getQualification());
//			em.setEmail(emp.getEmail());
//		}
//	}
	

@Override
public void deleteEmp(long id) {
	//emps=this.emps.stream().filter(e-> e.getId()!=id).collect(Collectors.toList());
	employeeRepository.deleteById(id);
	
}


}
