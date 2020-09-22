<%--
  Created by IntelliJ IDEA.
  User: HJY
  Date: 2020/8/24
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 导入Springmvc表单标签库 -->
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!-- 导入JSTL标签库 -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- Springmvc的表单标签：
         1. 可以快速的开发表单
         2. 可以更加方便的回显数据.

    Springmvc表单标签遇到的问题:
        Neither BindingResult nor plain target object
        for bean name 'command' available as request attribute

    问题原因: Springmvc的表单标签必须要进行数据的回显。 默认会使用"command"这个key到request中
                      找回显的数据。如果找不到，则抛出异常。
    问题解决: 让Springmvc可以通过"command"从request中找到要回显的数据.
            还可以通过modelAttribute来指定一个key替换默认的command

    表单标签在最终执行时会转化成原始的HTML标签.
 -->
    <form:form action="${pageContext.request.contextPath }/emp" method="post" modelAttribute="employee">

        <c:if test="${!empty employee.id}" var="flag">
            <form:hidden path="id"/>
            <input type="hidden" name="_method" value="PUT"/>
        </c:if>

        lastName:<form:input path="lastName" /> <!-- path就相当于HTML中input标签中的name属性 -->
        <!--  <input type="text"	 name="lastName"/> -->
        <br/>
        Email: <form:input path="email"/>
        <br/>
        <!-- radiobuttons 可以根据Map数据来生成单选框 -->
        Gender:<form:radiobuttons path="gender" items="${genders }" />
        <br/>
        deptName:<form:select path="dept.id" items="${depts}" itemLabel="departmentName" itemValue="id"></form:select>

        <!-- <select name="department.id">
        <option value="1">开发部</option>
        <option value="2">测试部</option>
        </select> -->
        <br/>
        <c:if test="${flag }">
            <input type="submit" value="Edit"/>
        </c:if>
        <c:if test="${!flag }">
            <input type="submit" value="ADD"/>
        </c:if>
    </form:form>
</body>
</html>
