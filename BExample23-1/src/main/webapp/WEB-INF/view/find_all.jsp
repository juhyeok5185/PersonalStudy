<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="UTF-8">
<title>Todos</title>
<script>
	$(document).ready(function() {
		const $tbody = $('#tbody');
		$('#add').on('click', function() {
			const param = { job : $('#job').val() };
			$.ajax({
				url: '/api/todos',
				method: 'post',
				data: param,
				success(result) {
					$tbody.empty();
					$.each(result, function(index, todo) {
						console.log(todo);
						const a = 10;
						const html=`
							<tr>
								<td>\${todo.no}</td>
								<td>\${todo.job}</td>
								<td>\${todo.regday}</td>
								<td> 
									\${todo.isFinish?`<button class='change' data-no=\${todo.no}>작업중으로 변경</button>`:
										`<button class='change' data-no=\${todo.no}>완료로 변경</button>`}
									<button type="button" class="delete" data-no="${todo.no}">삭제</button>
								</td>
							</tr>
						`;
						$tbody.append(html);
					});
				}
			})
		});
	})
</script>
</head>
<body>
	<div>
		<label for="job">할일 <input type="text" id="job" name="job"
			placeholder="할일 입력....">
		</label>
		<button id="add">추가</button>
	</div>
	<table class="table">
		<colgroup>
			<col width="20%">
			<col width="30%">
			<col width="20%">
			<col width="20%">
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>등록일</th>
				<th></th>
			</tr>
		</thead>
		<tbody id="tbody">
			<!--  for(Todo todo : todos) -->
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.no }</td>
					<td>${todo.job }</td>
					<td>${todo.regday }</td>
					<td>
						<!--
							조건이 여러개 일때는 아래처럼, 또는
							c:choose ~ c:when ~ c:otherwise를 사용한다 
						--> <c:if test="${todo.isFinish==true}">
							<button type="button" class="change" data-no="${todo.no}">작업중으로
								변경</button>
						</c:if> <c:if test="${todo.isFinish==false}">
							<button type="button" class="change" data-no="${todo.no}">완료로
								변경</button>
						</c:if>
						<button type="button" class="delete" data-no="${todo.no}">삭제</button>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>




