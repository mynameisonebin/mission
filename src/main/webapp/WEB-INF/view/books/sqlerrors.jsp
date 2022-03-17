<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!--JSTL 사용-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sql타입 에러</title>
</head>
<body>
<h2>타입입력이 잘못되었습니당.</h2>
혹시나 빈값을 넣거나 형식이 잘못었습니다.<br>
<input type="button" value="다시 입력하기" onclick="location.href='<c:url value="/books/add"/>'">
</body>
</html>