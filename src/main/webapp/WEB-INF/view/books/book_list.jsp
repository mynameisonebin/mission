<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!--스프링프레임워크의 JSP 기술중에 form taglib 가 있습니다. form 태그라이브러리를 사용하면 
	HTML 폼에 데이터를 바인딩하거나 에러메세지 처리등을 간편하게 할 수 있습니다.-->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!--메시지를 사용하기 위해 추가-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!--JSTL 사용-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서관리</title>
</head>
<body>
<h2>도서정보관리-리스트</h2><br>
<form:form commandName="search" action="search" method="GET">
	<label>
			<select name="op">
				<option value="BOOKNAME">제목</option>
				<option value="BOOKMAKE">저자</option>
				<option value="PUBLISHER">출판사</option>
			</select>
	</label>
	<label> 
		검색 키워드 입력: <input name ="keyword" placeholder="도서 제목 또는 저자입력"/>
	</label>
		<input type="submit" value="찾기">
</form:form>

<form:form commandName="books" action="/list" method="GET">
		<table border="1">
			<tr>
				<th>등록 번호</th><th>도서 표지</th><th>도서 ISBN</th>
				<th>도서 제목</th><th>저자</th><th>출판사</th><th>가격</th>
			</tr>
			<c:forEach var="book" items="${books}">
				<tr>
					<td>${book.booknumber}</td><td><img src= "<c:url value='/path/${book.image}'/>" width="150" height="200" alt="책 사진"></td><td>${book.bookisbn}</td>
					<td><a href="<c:url value='/books/read/${book.bookisbn}'/>">
						${book.bookname}</a></td><td>${book.bookmake}</td>
					<td>${book.publisher}</td><td>${book.price}</td>
				</tr>
			</c:forEach>
		</table>
	</form:form>
<c:if test="${msg != null}">
	<script>alert("${msg}");</script>
</c:if>

</body>
</html>