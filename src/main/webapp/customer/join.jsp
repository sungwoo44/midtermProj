<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel= "stylesheet" href="${pageContext.request.contextPath}/assets/css/NewStyle.css">
</head>
<body>
<%@ include file="../header.jsp" %>
	<div class="contents-wrap">
  <h3 style="text-align:center;">회원 등록</h3>
  <hr>
          <form action="" method="post">
     
             <div class="form-group">
                <label for="userid">아이디</label>
                <input id="userid" class="id-input" name="userid" type="text" placeholder="아이디를 입력해 주세요.(최대40)" />
            </div>
            <div class="form-group">
                <label for="name">이름</label>
                <input id="name" name="name" type="text" placeholder="이름(최대13)" />
            </div>
            <div class="form-group">
                <label for="email">이메일</label>
                <input id="email" name="email" type="text" placeholder="이메일을 입력해 주세요.(최대40)" />
            </div>
            <div class="form-group">
                <label for="age">나이</label>
                <input id="age" name="age" type="text" placeholder="나이를 입력하세요" />
            </div>
            <button class="join-btn" type="submit">회원가입</button>
          </form>
        </div>
	
</body>
</html>