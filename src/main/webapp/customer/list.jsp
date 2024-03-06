<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../assets/css/customers.css">
</head>
<body>
<%@ include file="../header.jsp" %>
<h2>회원목록</h2>
<hr>

	<c:forEach items="${CustomerList }" var="vo" varStatus="status">
    <div class="member-entry">
        <ul id="row">
            <li><c:out value="${status.index + 1}" /></li>
            <li><c:out value="${vo.customId}" /></li>
            <li><c:out value="${vo.name}" /></li>
            <li><c:out value="${vo.email}" /></li>
            <li><c:out value="${vo.age}" /></li>
            <li><fmt:formatDate value="${vo.reg_date}" pattern="yyyy-MM-dd HH:mm:ss" /></li>
        </ul>
    </div>
</c:forEach>
	
		<button onclick="location.href='http://localhost:8088/midtermProj/index.jsp'">HOME</button>
	
</body>
</html>