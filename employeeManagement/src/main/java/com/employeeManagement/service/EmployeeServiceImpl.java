package com.employeeManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeManagement.dao.EmployeeDAO;
import com.employeeManagement.vo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public void insertEmployee(Employee employee) {
//		employeeDAO.insertEmployee(employee);
		System.out.println("서비스");
		
	}
	
	@Override
	public List<Employee> selectByEmployeeNo(int employeeNo) {
		return employeeDAO.selectByEmployeeNo(employeeNo);
	}

	@Override
	public void deleteEmployee(int employeeNo) {
		employeeDAO.deleteEmployeeByEmployeeNo(employeeNo);
		System.out.println("서비스들어왔어");
	}

}
