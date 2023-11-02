<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>显示学生</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	
	
</head>
<body>
<c:set var="ctx"  value="${pageContext.request.contextPath}"/>

<table border="1">
	<tr>
		<td>id</td>
		<td>loginname</td>
		<td>password</td>
		<td>username</td>
		<td>clazz_id</td>
		<td>操作</td>
	</tr>

	<c:forEach items="${requestScope.students}" var="student">
		<tr>
			<td>${student.id}</td>
			<td>${student.loginname}</td>
			<td>${student.password}</td>
			<td>${student.username}</td>
			<td>${student.clazz_id}</td>
			<td>
				<a href="${ctx}/student/deleteStudent/${student.id}">删除</a>
				<a href="${ctx}/student/queryStudentByNo/${student.id}">修改</a>
				<a href="${ctx}/student/addStudent">添加</a>
			</td>
		</tr>
	</c:forEach>
</table>

	
</body>
</html>