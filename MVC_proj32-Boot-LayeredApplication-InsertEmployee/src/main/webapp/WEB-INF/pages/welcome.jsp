<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="text-align: center; color: blue">Welcome to Employee
	Registration page</h1>
<br>

<form:form method="POST" modelAttribute="empCmd">
Employee Name :: <form:input path="ename" />&nbsp;<b style="color:red"><form:errors path="ename"/></b>
	<br>
Employee Job :: <form:input path="job" />&nbsp;<b style="color:red"><form:errors path="job"/></b>
	<br>
Employee  sal :: <form:input path="sal" />&nbsp;<b style="color:red"><form:errors path="sal"/></b>
	<br>
	<input type="hidden" name="cToken" value="${sToken}">
	<input type="submit" value="register">
</form:form>