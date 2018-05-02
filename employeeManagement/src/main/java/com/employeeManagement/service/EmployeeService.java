package com.employeeManagement.service;

import java.util.List;

import com.employeeManagement.vo.Employee;

public interface EmployeeService {

	/**
	 * 직원 정보 입력
	 * @param employee
	 */
	void insertEmployee(Employee employee);
	
	/**
	 * 직원 번호로 직원 정보 조회
	 * @param employeeNo
	 * @return
	 */
	List<Employee> selectByEmployeeNo(int employeeNo);
	
	void deleteEmployee(int employeeNo);
}
