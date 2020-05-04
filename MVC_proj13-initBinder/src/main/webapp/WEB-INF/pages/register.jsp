<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 style="color: blue; text-align: center">Welcome to Employee
	page</h1>


<form:form method="POST" commandName="empCmd">
<b style="color: red"><form:errors path="*" /></b><br>
	Employee NO :: <form:input path="eno" />
	<br>
	Employee Name :: <form:input path="ename" />
	<br>
	Employee DOB :: <form:input path="dob" />
	<br>
	Employee DOJ :: <form:input path="doj" />
	<br>
	Employee mgr :: <form:input path="mgr" />
	<br>
	<input type="submit" value="register">
</form:form>
<br>
<c:if test="${!empty empCmd }">
	Result :: ${empCmd}
</c:if>
