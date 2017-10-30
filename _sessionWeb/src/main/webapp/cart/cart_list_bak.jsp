<%@page import="java.util.Set,java.util.HashMap"%>
<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>장바구니에 담은 물건들</h2>
<%
	HashMap<String, Integer> map = (HashMap)session.getAttribute("cart");
	Set<String> keys = map.keySet();
%>


<table>
	<thead>
		<tr>
			<th>제품</th>
			<th>주문개수</th>
		</tr>
	</thead>
	<tbody>
		<%for(String key : keys){ %>
			<tr>	
				<td><%=key %></td>
				<td><%=map.get(key) %></td>
			</tr>
		<%} %>
	</tbody>
</table>
<a href="/_sessionWeb/cart/showItems">쇼핑목록이동</a>
<a href="/_sessionWeb/logout">로그아웃</a>
</body>
</html>