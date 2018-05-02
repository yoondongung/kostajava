package com.employeeManagement.vo;

import java.io.Serializable;

public class Employee implements Serializable{
   private int employeeNo;            /* 직원 번호 */
   private String employeeName;      /* 이름 */
   private String employeePhoneNum;   /* 핸드폰 번호 */
   private String employeePosition;   /* 직급 */
   private String employeeEmail;      /* 이메일 */
   
   //생성자
   public Employee() {   }

   public Employee(int employeeNo, String employeeName, String employeePhoneNum, String employeePosition,
         String employeeEmail) {
      super();
      this.employeeNo = employeeNo;
      this.employeeName = employeeName;
      this.employeePhoneNum = employeePhoneNum;
      this.employeePosition = employeePosition;
      this.employeeEmail = employeeEmail;
   }

   public int getEmployeeNo() {
      return employeeNo;
   }

   public void setEmployeeNo(int employeeNo) {
      this.employeeNo = employeeNo;
   }

   public String getEmployeeName() {
      return employeeName;
   }

   public void setEmployeeName(String employeeName) {
      this.employeeName = employeeName;
   }

   public String getEmployeePhoneNum() {
      return employeePhoneNum;
   }

   public void setEmployeePhoneNum(String employeePhoneNum) {
      this.employeePhoneNum = employeePhoneNum;
   }

   public String getEmployeePosition() {
      return employeePosition;
   }

   public void setEmployeePosition(String employeePosition) {
      this.employeePosition = employeePosition;
   }

   public String getEmployeeEmail() {
      return employeeEmail;
   }

   public void setEmployeeEmail(String employeeEmail) {
      this.employeeEmail = employeeEmail;
   }

   @Override
   public String toString() {
      return "employee [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", employeePhoneNum="
            + employeePhoneNum + ", employeePosition=" + employeePosition + ", employeeEmail=" + employeeEmail
            + "]";
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((employeeEmail == null) ? 0 : employeeEmail.hashCode());
      result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
      result = prime * result + employeeNo;
      result = prime * result + ((employeePhoneNum == null) ? 0 : employeePhoneNum.hashCode());
      result = prime * result + ((employeePosition == null) ? 0 : employeePosition.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Employee other = (Employee) obj;
      if (employeeEmail == null) {
         if (other.employeeEmail != null)
            return false;
      } else if (!employeeEmail.equals(other.employeeEmail))
         return false;
      if (employeeName == null) {
         if (other.employeeName != null)
            return false;
      } else if (!employeeName.equals(other.employeeName))
         return false;
      if (employeeNo != other.employeeNo)
         return false;
      if (employeePhoneNum == null) {
         if (other.employeePhoneNum != null)
            return false;
      } else if (!employeePhoneNum.equals(other.employeePhoneNum))
         return false;
      if (employeePosition == null) {
         if (other.employeePosition != null)
            return false;
      } else if (!employeePosition.equals(other.employeePosition))
         return false;
      return true;
   }
   
   
}