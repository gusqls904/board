<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 조회</title>
</head>
<body>
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
	<a href="/board/modify?bno=${view.bno}">게시물 수정</a>
	</div>

</body>
</html>