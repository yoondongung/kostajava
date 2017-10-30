<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<jsp:include page="/menu.jsp"/>
 <p>
 
 	<a href="/_sessionWeb/stacknums/stack">숫자누적 요청</a>
 	<a href="/_sessionWeb/stacknums/removenums">누적된 숫자 제거</a>
 </p>
 
<c:choose>
	<c:when test="${empty sessionScope.numberList }">
		누적된 숫자가 없습니다.
	</c:when>
	<c:otherwise>
		<ul>
			<c:forEach items="${sessionScope.numberList}" var="num">
				<li>${num }</li>
			</c:forEach>
		</ul>
	</c:otherwise>
	
</c:choose>

</body>
</html>










