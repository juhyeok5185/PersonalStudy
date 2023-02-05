<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script>
		msg = "${msg}";
		if(msg!="")
			alert(msg);
	</script>
</head>
<body>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>번호</th><th>내용</th><th>작성일</th><th>완료일</th><th>완료 여부</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list}" var="todo">
			<tr>
				<td>${todo.no }</td>
				<td><a href="/Todo/read?no=${todo.no}"]>${todo.title }</a></td>
				<td>${todo.writeday }</td>
				<td>${todo.deadline }</td>
				
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<br>
	<a class="btn btn-outline-danger" href="/Todo/write">할일 작성</a>
</body>
</html>