<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<h1 style="coloe: red; text-align: center">
	<spring:message code="file.title" />
</h1>
<form action="/home.htm" method="POST">
	<h2 style="coloe: red">
		<spring:message code="file.no" />
		<input type="text" name="sno"><br>
		<spring:message code="file.name" />
		<input type="text" name="sname"><br>
		<spring:message code="file.age" />
		<input type="text" name="age"><br> <input type="submit"
			value="<spring:message code="file.register"/>">
	</h2>
</form><br><br>

<a href="?language=hi_IN"><spring:message code="file.hindi"/></a>&nbsp;&nbsp;&nbsp;
<a href="?language=ar_AR"><spring:message code="file.arabic"/></a>&nbsp;&nbsp;&nbsp;
<a href="?language=bn_IN"><spring:message code="file.bengali"/></a>&nbsp;&nbsp;&nbsp;
<a href="?language=cn_CH"><spring:message code="file.bengali"/></a>&nbsp;&nbsp;&nbsp;
<a href="?language=rn">English</a>
