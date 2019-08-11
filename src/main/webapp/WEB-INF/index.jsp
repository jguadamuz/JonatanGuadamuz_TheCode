<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome, again</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<!-- 
<script type="text/javascript" src="js/app.js"></script>
 -->
</head>
<body>
	<p class="error"><c:out value="${error}"/></p>
	<p>What is the code?</p>
	<form action="/code" method="post">
		<input type="text" name="code"> <button type="submit">Try Code</button>
	</form>
</body>
</html>
