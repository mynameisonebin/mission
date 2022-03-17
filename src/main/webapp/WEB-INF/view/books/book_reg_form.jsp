<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!--스프링프레임워크의 JSP 기술중에 form taglib 가 있습니다. form 태그라이브러리를 사용하면 
	HTML 폼에 데이터를 바인딩하거나 에러메세지 처리등을 간편하게 할 수 있습니다.-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 추가</title>
</head>
<body>
<form:form commandName="add" action="add" method="POST" enctype="multipart/form-data">
<table border="1">
			<tr>
				<th colspan ="3"> *표시는 필수 입니다.</th>
			</tr>
			<tr>
				<td rowspan="6">이미지</td><td>*BOOK ISBN(숫자만 입력가능)</td><td><input type="text" name="bookisbn"></td>
		
				<tr><td>*도서명</td><td><form:input path="bookname"/></td></tr>
				<tr><td>*저자</td><td><form:input path="bookmake"/></td></tr>
				<tr><td>*출판사</td><td><form:input path="publisher"/></td></tr>
				<tr><td>*도서가격</td><td><form:input path="price"/></td></tr>
				<tr><td>*이미지</td>	<td><input type="file" name="file" multiple ></td></tr>
				<tr><td>*책 소개</td><td><form:input path="bookintrod"/></td></tr>
</table>
	<input type="submit" value="도서정보 추가">
	<input type="button" value="도서정보 목록" onclick="location.href='list'">
</form:form>
</body>
</html>