<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>고구마 2개</title>
</head>
<body>

${data}<br> 
<!-- 위와 같이 그냥 키 값만 주면 toString()한 값이 출력됨 -->
<!-- {gender=여, name=haley, job=학생, age=28} -->

나이 : ${data.age} <br>
이름 : ${data.name} <br>
성별 : ${data.gender} <br>
직업 : ${data.job} <br>

<!-- 나이 : 28 
이름 : haley 
성별 : 여 
직업 : 학생  -->

</body>
</html>