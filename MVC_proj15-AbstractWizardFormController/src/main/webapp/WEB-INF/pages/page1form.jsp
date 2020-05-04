<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 style="color: blue; text-align: center">First Form page</h1>

<form:form method="POST" commandName="empCmd">
Employee NO :: <form:input path="eno" /><br>
Employee Name :: <form:input path="ename" /><br>
Employee Address :: <form:input path="address" /><br>
<input type="submit" value="NEXT" name="_target1">&nbsp
<input type="submit" value="cancle" name="_cancle">
</form:form>


