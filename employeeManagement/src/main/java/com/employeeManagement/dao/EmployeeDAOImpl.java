package com.employeeManagement.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employeeManagement.vo.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

   @Autowired
   private SqlSessionTemplate session;

   private String makeSqlId(String id) {
      return "com.employeeManagement.config.mybatis.mapper.employeeMapper." + id;
   }

   @Override
   public int insertEmployee(Employee employee) {
      return session.insert(makeSqlId("insertEmployee"), employee);
   }

   @Override
   public int updateEmployeeByEmployeeNo(Employee employee) {
      return session.update(makeSqlId("updateEmployeeByNo"), employee);
   }

   @Override
   public int deleteEmployeeByEmployeeNo(int employeeNo) {
      return session.delete(makeSqlId("deleteEmployeeByNo"), employeeNo);
   }

   @Override
   public List<Employee> selectByEmployeeNo(int employeeNo) {
      return session.selectList(makeSqlId("seleteEmployeeByNo"), employeeNo);
   }

   @Override
   public List<Employee> selectByEmployeeName(String employeeName) {
      return session.selectList(makeSqlId("seleteEmployeeByName"), employeeName);
   }

   @Override
   public List<Employee> selectByEmployeePhoneNum(String employeePhoneNum) {
      return session.selectList(makeSqlId("seleteEmployeeByPhoneNum"), employeePhoneNum);
   }

   @Override
   public List<Employee> selectByEmployeePosition(String employeePosition) {
      return session.selectList(makeSqlId("seleteEmployeeByPosition"), employeePosition);
   }

   @Override
   public List<Employee> selectByEmployeeEmail(String employeeEmail) {
      return session.selectList(makeSqlId("seleteEmployeeByEmail"), employeeEmail);
   }

   
}