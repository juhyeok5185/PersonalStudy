<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="UTF-8">
<title>Todos</title>
</head>
<body>
	<div>
		<label for="job">할일
			<input type="text" id="job" name="job" placeholder="할일 입력....">
		</label>
		<button>추가</button>
	</div>
	<table class="table">
		<colgroup>
			<col width="20%"><col width="30%"><col width="20%"><col width="20%">
		</colgroup>
		<thead>
			<tr><th>번호</th><th>제목</th><th>등록일</th><th></th></tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.no }</td>
					<td>${todo.job }</td>
					<td>${todo.regday }</td>
					<td>
						<!--
							조건이 여러개 일때는 아래처럼, 또는
							c:choose ~ c:when ~ c:otherwise를 사용한다 
						-->
						<c:if test="${todo.isFinish==true }">
							<button type="button">작업중으로 변경</button>
						</c:if>
						<c:if test="${todo.isFinish==false }">
							<button type="button">완료로 변경</button>
						</c:if>
						<button type="button">삭제</button>
					</td>
				</tr>
			</c:forEach>		
		</tbody>
	</table>
</body>
</html>




