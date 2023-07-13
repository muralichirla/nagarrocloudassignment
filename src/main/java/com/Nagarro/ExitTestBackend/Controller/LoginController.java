package com.Nagarro.ExitTestBackend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nagarro.ExitTestBackend.Dto.EmployeeDto;
import com.Nagarro.ExitTestBackend.Service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")





public class LoginController {
	
	private EmployeeService employeeService;
	
	
	@PostMapping(path="/Save")
	public String saveEmployee(@RequestBody EmployeeDto employeeDto)
	{
		String id=employeeService.addEmployee(employeeDto);
		return id;
	}

}
