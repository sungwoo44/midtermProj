<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구매 조회</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/css/customers.css">
<link rel="stylesheet" href="assets/css/modal.css">
</head>
<body>
<%@ include file="../header.jsp" %>
	<h3>주문 관리</h3>
	<div class="search">
	<!-- form action 이 없을 때 동작은 자기자신 url 입니다.  method 기본값은  GET -->
	<form action="">
		
		<button id="selectAll" type="button" >전체보기</button>
	</form>
</div>
		
		<hr>
		<ul  id = "list">
										
		</ul>
		
	<div class="modal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">주문 조회</h4>
				</div>
				<div class="modal-body">
				<ul>
					<li>
						<input type="text" id="buy_Idx" placeholder="주문번호를 입력하세요.">
					</li>
				
					<li>
						<input type="text" id="customid" placeholder="아이디를 입력하세요.">
					</li>
					<li>
						<input type="number" id="pcode" placeholder="상품코드를 입력하세요.">
					</li>
					<form>
					  <p><input type="date" value=""></p>
					</form>
					<li>
						<button id="post">저장</button>&nbsp;&nbsp;&nbsp;<button id="clear">다시쓰기</button>
					</li>
				</ul>
				</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
						
					</div>
				</div>
			</div>
		</div>
		
		



	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript">
	const modal = new bootstrap.Modal(document.querySelector('.modal'));
	
	//js 파일에서는 서버 애트리뷰트를 가져올 수 없습니다.
	//		 jsp파일안에 있는 script 태그에서만 가능합니다.
		const temp = '${cate}'
	</script>

	<script type="text/javascript" src="assets/js/buy_post.js"></script>
	<script type="text/javascript" src="assets/js/buy_list.js"></script>
	<script type="text/javascript" src="assets/js/search.js"></script>
	
</body>
</html>