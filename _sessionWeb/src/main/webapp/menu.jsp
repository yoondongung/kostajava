<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
	<%--비로그인 메뉴 --%>
	<c:when test="${empty sessionScope.loginMember }">
		<a href="/_sessionWeb/login/login_form.jsp">로그인폼</a>
	</c:when>
	<%--로그인 메뉴 --%>
	<c:otherwise>
		<a href="/_sessionWeb/stacknums/stack">숫자누적 요청</a>
		<a href="/_sessionWeb/logout">로그아웃</a>
	</c:otherwise>
</c:choose>
<!-- 로그인 여부와 상관없이 보는 메뉴 -->
<a href="/_sessionWeb/cart/showItems">상품목록 보기</a>
<hr>