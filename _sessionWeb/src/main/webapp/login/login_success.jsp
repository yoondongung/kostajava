<%@page import="vo.Member"%>
<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/menu.jsp"/>
<h1>login_success.jsp</h1>
${sessionScope.loginMember.name }님 환영합니다.

<p>
	<a href="/_sessionWeb/index.jsp">메인페이지</a>
	<a href="/_sessionWeb/logout">로그아웃</a>
</p>
</body>
</html>













