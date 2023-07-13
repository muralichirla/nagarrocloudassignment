package com.Nagarro.ExitTestBackend.Dto;



public class EmployeeDto {

	
	private int employeeid;
	
	
	private String employeename;
	

	private String email;
	
	private String password;

	public EmployeeDto(int employeeid, String employeename, String email, String password) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.email = email;
		this.password = password;
	}

	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "EmployeeDto [employeeid=" + employeeid + ", employeename=" + employeename + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
	
}
