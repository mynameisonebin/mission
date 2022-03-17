<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!--JSTL 사용-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<h2>도서정보관리-도서정보</h2>
	<table border="1">
			
				<tr>
					<td rowspan="5"><img src= "<c:url value='/path/${books.image}'/>" width="150" height="200" alt="책 사진"></td><td>BOOK ISBN</td><td>${books.bookisbn}</td>
					<tr><td>도서명</td><td>${books.bookisbn}</td></tr>
					<tr><td>저자</td><td>${books.bookmake}</td></tr>
					<tr><td>출판사</td><td>${books.publisher}</td></tr>
					<tr><td>도서가격</td><td>${books.price}</td></tr>
					<tr><td>책 소개</td><td colspan ="2">${books.bookintrod}</td></tr>
			
	</table>
	<input type="button" value="도서정보 목록" onclick="location.href='<c:url value="/books/list"/>'">
	
</body>
</html>