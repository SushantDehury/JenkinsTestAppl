<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 style="color: blue; text-align: center">Thired Form page</h1>

<form:form method="POST" commandName="empCmd">
Employee Desg :: <form:input path="desg" /><br>
Employee sal :: <form:input path="sal" /><br>
<input type="submit" value="previous" name="_target1">&nbsp
<input type="submit" value="register" name="_finish">&nbsp
<input type="submit" value="cancle" name="_cancle">
</form:form>
