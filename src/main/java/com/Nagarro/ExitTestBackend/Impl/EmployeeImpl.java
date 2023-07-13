 package com.Nagarro.ExitTestBackend.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.Nagarro.ExitTestBackend.Dto.EmployeeDto;
import com.Nagarro.ExitTestBackend.Entity.Employee;
import com.Nagarro.ExitTestBackend.Repo.EmployeeRepo;
import com.Nagarro.ExitTestBackend.Service.EmployeeService;

public class EmployeeImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepo employeerepo;
	
   
	public String addEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		
		Employee employee=new Employee(
			employeeDto.getEmployeeid(),
			employeeDto.getEmployeename(),
			employeeDto.getEmail(),
			
			employeeDto.getPassword()
			
			
		);
		
		employeerepo.save(employee);
		return employee.getEmployeename();
	}

}
