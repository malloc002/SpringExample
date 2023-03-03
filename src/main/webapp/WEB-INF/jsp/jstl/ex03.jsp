<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 포맷</title>
</head>
<body>
	<h1>JSTL 포맷 라이브러리</h1>
	
	<c:set var="number" value="123456789" />
	<h3>숫자 출력</h3>
	<h4><fmt:formatNumber value="${number }" /></h4>
	
	<h3>percent</h3>
	<h4><fmt:formatNumber value="0.35" type="percent" /></h4>
	<h4><fmt:formatNumber value="${3/5 }" type="percent" /></h4>
	
	<h3>통화</h3>
	<h4><fmt:formatNumber value="${number }" type="currency" /></h4>
	<h4><fmt:formatNumber value="${number }" type="currency" currencySymbol="$" /></h4>
	
	<%-- 변수로 만드는 것 --%>
	<fmt:formatNumber value="${number }" type="currency" var="won"/>
	<h4>${won }</h4>
	
	<h3>숫자 소수점 패턴</h3>
	
	<c:set var="pi" value="3.1415926535" />
	
	<h4>${pi }</h4>
	
	<h4><fmt:formatNumber value="${pi }" pattern="#.##" /></h4>
	<h4><fmt:formatNumber value="${pi }" pattern="0.00" /></h4>
	<h4><fmt:formatNumber value="${pi }" pattern="#.##############" /></h4>
	<h4><fmt:formatNumber value="${pi }" pattern="0.00000000000000" /></h4>
	<%-- #은 채울 수 있는 데까지만 채우고 0은 나머지 남은 거 0으로 채워줌 --%>
	
	<hr>
	
	<h3>날짜 포맷</h3>
	
	<h4>${now }</h4>
	<h4><fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일 HH시 mm분 ss초" /></h4>
	
	<%-- 2023/03/03 12:11:10 --%>
	<%-- 2023-03-03 12:11:10 --%>
	<%-- String -> Date -> String --%>
	<fmt:parseDate value="${dateString }" pattern="yyyy/MM/dd HH:mm:ss" var="date" />
	<h4>${date }</h4>
	
	
</body>
</html>