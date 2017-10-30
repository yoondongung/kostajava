<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	1.Session에서 numberList를 조회
	2.반복문을 이용해 list내의 숫자들을 출력.
 -->
 <p>
 	<a href="/_sessionWeb/stacknums/stack">숫자누적 요청</a>
 	<a href="/_sessionWeb/stacknums/removenums">누적된 숫자 제거</a>
 </p>
 
<%
 	ArrayList<Integer> list = (ArrayList<Integer>)session.getAttribute("numberList");
 	if(list == null || list.isEmpty()){
%>		
누적된 숫자가 없습니다.
<%} else {%>
<ul>
<%
	for(Integer num : list) {
%>
	<li><%=num %></li>
<%}//for 종료 %>
 </ul>
<%}//else 종료%>

</body>
</html>










