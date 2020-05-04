<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="color:red;text-align:center">Welcome to Student Registration</h1>

<form:form method="POST" modelAttribute="stuCmd">
	Student Name :: <form:input path="name"/>&nbsp;<b style='color:red'><form:errors  path="name"/></b><br>
	Student Address :: <form:input path="address"/>&nbsp;<b style='color:red'><form:errors path="address"/></b><br>
	Student phone :: <form:input path="phone"/>&nbsp;<b style='color:red'><form:errors path="phone"/></b><br>
	<input type="hidden" name="cToken" value="${sToken}">
	<input type="submit" value="register">
</form:form>

<c:if test="${!empty stuResult }">
Result :: ${stuResult}
</c:if>