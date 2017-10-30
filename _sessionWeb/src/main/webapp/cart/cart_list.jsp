<%@page import="java.util.Set,java.util.HashMap"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/menu.jsp"/>

<h2>장바구니에 담은 물건들</h2>


<table>
	<thead>
		<tr>
			<th>제품</th>
			<th>주문개수</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${sessionScope.cart }" var="item">
			<tr>	
				<td>${item.key }</td>
				<td>${item.value }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="/_sessionWeb/cart/showItems">쇼핑목록이동</a>
<a href="/_sessionWeb/logout">로그아웃</a>
</body>
</html>