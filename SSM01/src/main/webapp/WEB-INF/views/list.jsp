<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 导入JSTL标签 -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="scripts/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="scripts/mycrud.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="" method="post">
		<input type="hidden" name="_method" value="DELETE">
	</form>
	<h1 align="center">员工信息列表</h1>
	<table align="center" border="1px" width="70%" cellspacing="0px">
		<tr>
			<th>ID</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Gender</th>
			<th>DeptName</th>
			<th>Operation</th>
		</tr>
		<c:forEach items="${emps}" var="emp">
			<tr align="center">
				<td>${emp.id }</td>
				<td>${emp.lastName }</td>
				<td>${emp.email }</td>
				<td>${emp.gender==0?'女':'男' }</td>
				<td>${emp.dept.departmentName }</td>
				<td>
					<a href="emp/${emp.id}">Edit</a>
					<a class="del" href="emp/${emp.id}">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<h2 align="center"> <a href="emp">Add New Emp </a></h2>
</body>
</html>