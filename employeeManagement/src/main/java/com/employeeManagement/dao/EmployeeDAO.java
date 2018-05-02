package com.employeeManagement.dao;

import java.util.List;

import com.employeeManagement.vo.Employee;

public interface EmployeeDAO {

   /**
    * 직원정보 등록
    * 
    * @param employee
    * @return
    */
   int insertEmployee(Employee employee);

   /**
    * 직원 정보 수정
    * @param employee
    * @return
    */
   int updateEmployeeByEmployeeNo(Employee employee);
   
   /**
    * 직원 탈퇴
    * @param employeeNo
    * @return
    */
   int deleteEmployeeByEmployeeNo(int employeeNo);
   
   /**
    * 직원번호로 직원 정보 조회
    * 
    * @param employeeNo
    * @return
    */
   List<Employee> selectByEmployeeNo(int employeeNo);

   /**
    * 직원이름으로 직원 정보 조회
    * 
    * @param employeeName
    * @return
    */
   List<Employee> selectByEmployeeName(String employeeName);

   /**
    * 폰번호로 직원 정보 조회
    * 
    * @param employeePhoneNum
    * @return
    */
   List<Employee> selectByEmployeePhoneNum(String employeePhoneNum);

   /**
    * 직급으로 직원 정보 조회
    * 
    * @param employeePosition
    * @return
    */
   List<Employee> selectByEmployeePosition(String employeePosition);

   /**
    * 이메일로 직원 정보 조회
    * 
    * @param employeeEmail
    * @return
    */
   List<Employee> selectByEmployeeEmail(String employeeEmail);

}