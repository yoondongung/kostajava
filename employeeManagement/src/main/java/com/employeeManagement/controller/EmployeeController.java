package com.employeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.employeeManagement.service.EmployeeService;
import com.employeeManagement.vo.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping("/read_employeeNo")
	public ModelAndView readEmployeeByEmployeeNo(int employeeNo) {
		System.out.println(employeeNo);
		List<Employee> employee = service.selectByEmployeeNo(employeeNo);
		System.out.println(employee);
		return new ModelAndView("dkssud", "employeeList", employee);
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(int employeeNo) {
		System.out.println(employeeNo);
		service.deleteEmployee(employeeNo);
		return new ModelAndView("index");
	}
}