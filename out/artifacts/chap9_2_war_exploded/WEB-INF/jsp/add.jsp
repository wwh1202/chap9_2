<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<h1>添加学生</h1>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<form action="${ctx}/student/addStudent" method="post">
    <!--id:<input type="text" name="id" /><br>-->
    loginname:<input type="text" name="loginname" /><br>
    password:<input type="text" name="password" /><br>
    username:<input type="text" name="username" /><br>
    clazz_id:<input type="text" name="clazz_id" /><br>
    <input type="submit" value="提交" />
</form>

</body>
</html>