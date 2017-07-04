<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 태그 라이브러리 추가 : jstl의 core 기능을 사용하기 위한 라이브러리 -> jsp에서 반복문 또는 if문을 사용하기 위해 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>아기 고구마</title>
</head>
<body>

	<table align="center" border="1">
		<tr>
			<td colspan="3" align="center">
				<h2>목록보기</h2>
			</td>
		</tr>

		<tr>
		<!-- width는 여기서 잡아주면 됨 -->
			<th width="100">글 번호</th>
			<th width="300">제목</th>
			<th width="100">아이디</th>
		</tr>
		<!-- data의 내용을 순서대로 board에 대입 -->
		<c:forEach var="board" items="${data}">
			<tr>
				<td align="center">${board.num}</td>
				<td align="center">${board.title}</td>
				<td align="center">${board.id}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>