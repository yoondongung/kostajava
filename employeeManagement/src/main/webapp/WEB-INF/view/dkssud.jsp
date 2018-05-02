<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
안녕하세요.
employeeList

<c:forEach items="${requestScope.employeeList }" var="employee">
				<tr>
					<td>${employee.employeeNo }</td>
					<td>${employee.employeeName }</td>
					<td>${employee.employeePhoneNum }</td>
					<td>${employee.employeePosition }</td>
					<td>${employee.employeeEmail }</td>
				</tr>	
</c:forEach>
</body>
</html>