<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改学生</title>
</head>
<body>
<h1>修改</h1>
<c:set var="ctx"  value="${pageContext.request.contextPath}"/>
<form action="${ctx}/student/updateStudent" method="post">
    id:       <input type="text" name="id" value="${student.id}" /><br>
    loginname:<input type="text" name="loginname" value="${student.loginname}" /><br>
    password:<input type="text" name="password" value="${student.password}" /><br>
    username:<input type="text" name="username" value="${student.username}" /><br>
    clazz_id:<input type="text" name="clazz_id" value="${student.clazz_id}"  /><br>
    <input type="submit" value="修改" />
</form>
</body>
</html>