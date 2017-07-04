<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>리다이렉트 테스트</title>
</head>
<body>
<!-- request와 model은 출력이 되지 않음 -->
<!-- request와 model은 포워딩 방법에서만 사용 가능  -->
request : ${request} <br>
model : ${model}<br>
<!-- session과 attr은 모든 이동 방식에서 사용 가능 -->
session : ${session}<br>
attr : ${attr}<br>
</body>
</html>