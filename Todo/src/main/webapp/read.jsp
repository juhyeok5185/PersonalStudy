<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<style>
#update, #delete {
	width: 90%;
	margin: 0 auto;
}

#toggle, #delete {
	display: inline;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<div class="mb-3 mt-3">
		<span>${todo.title}</span> (<span> 
		진행중인 작업
		</span>)
	</div>
	<div class="mb-3 mt-3">
		<label for="content">글 내용:</label>
		<textarea class="form-control" rows="5" id="content" name="content"
			id="content" disabled>${todo.content}</textarea>
	</div>
	<div class="mb-3 mt-3">
		<span>작성일 : ${ todo.writeday}</span> <span>완료일 : ${ todo.deadline}</span>
	</div>
	<hr>
	<form action="/Todo/toggle" method="post" id="toggle">
		<input type="hidden" name="no" value="${todo.no }">
		<button class="btn btn-outline-primary">
			완료
		</button>
	</form>
	<form action="/Todo/delete" method="post" id="delete">
		<input type="hidden" name="no" value="${todo.no }">
		<button class="btn btn-outline-dark">삭제</button>
	</form>
	<a class="btn btn-outline-danger" href="/Todo/list">할일 목록으로</a>
</body>
</html>