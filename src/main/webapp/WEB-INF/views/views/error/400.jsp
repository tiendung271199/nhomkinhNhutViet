<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/components/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Error 400 | Yêu cầu không hợp lệ</title>
	
	<c:url value="/resources/error" var="contextPath"></c:url>
	
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,900" rel="stylesheet">
	<link type="text/css" rel="stylesheet" href="${contextPath}/css/style.css" />
	<script type="text/javascript" src="${contextPath}/js/back.js"></script>
</head>

<body>
	<c:url value="/" var="urlIndex"></c:url>

	<div id="notfound">
		<div class="notfound">
			<div class="notfound-404">
				<h1>Oops!</h1>
			</div>
			<h2>400 - Yêu cầu không hợp lệ</h2>
			<p>Yêu cầu của bạn không hợp lệ, URL đã gặp vấn đề, 1 trong các tham số trên URL không hợp lệ.</p>
			<a href="${urlIndex}" style="margin-right: 10px">Trang chủ</a>
			<a href="javascript:void(0)" onclick="back()">Quay lại</a>
		</div>
	</div>
</body>
</html>
