<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<title>Insert title here</title>
</head>
<body>	
	<form action="/Todo/write" method="post">
		<div class="mb-3 mt-3">
    		<label for="title">할일 제목:</label>
      		<input type="text" class="form-control" placeholder="제목 입력" name="title">
    	</div>
    	<div class="mb-3 mt-3">
    		<label for="deadline">완료일:</label>
      		<input type="date" class="form-control" name="deadline">
    	</div>
		<div class="mb-3 mt-3">
      		<label for="comment">할일 내용:</label>
      		<textarea class="form-control" rows="5" name="content"></textarea>
	    </div>
		<button class="btn btn-outline-danger">작성</button>
	</form>
	<hr>
	<a class="btn btn-outline-primary" href="/Todo/list">할일 목록</a>
</body>
</html>