<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 조회</title>
</head>
<body>

<div id="nav">
	<%@ include file="../include/nav.jsp" %>
</div>

<form action="post">

	<label>제목</label> 
	${view.title}<br />

	<label>작성자</label> 
	${view.writer}<br />

	<label>내용</label>
	<br /> 
	${view.content}
	<br />
	
	</form>
	
	<div>
	<a href="/board/modify?bno=${view.bno}">게시물 수정</a>,<a href="/board/delete?bno=${view.bno}">게시물 삭제</a>
	</div>
	
	<!-- 댓글 시작 -->
	<ul>
		<c:forEach items="${reply }" var="reply">
			<li>
				<div>
					<p>${reply.writer } / <fmt:formatDate value="${reply.regDate}" pattern="yyyy-MM-dd"/> </p>
					<p>${reply.content }</p>
				</div>
			</li>
		</c:forEach>
	</ul>
	
	<div>
		<p>
			<label>댓글 작성자</label> <input type="text">
		</p>
		<p>
			<textarea rows="5" cols="50"></textarea>
		</p>
	
	</div>
	
	<!-- 댓글 끝 -->
	
</body>
</html>