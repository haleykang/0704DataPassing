<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>세 번째 고구마</title>
</head>
<body>

	<table align="center" border="1">

		<tr>
			<td align="center" colspan="2">
				<h3>상세보기</h3>
			</td>
		</tr>

		<tr>
			<td align="right">글 번호</td>
			<td><input type="number" value='${board.num}' readonly="readonly"/></td>
		</tr>

		<tr>
			<td align="right">아이디</td>
			<td><input type="text" value='${board.id}' /></td>
		</tr>
		<tr>
			<td align="right">제목</td>
			<td><input type="text" value='${board.title}' /></td>
		</tr>
		<tr>
			<td align="right">내용</td>
			<td><textarea rows="10" cols="30">${board.content}</textarea></td>
		</tr>

	</table>

</body>
</html>