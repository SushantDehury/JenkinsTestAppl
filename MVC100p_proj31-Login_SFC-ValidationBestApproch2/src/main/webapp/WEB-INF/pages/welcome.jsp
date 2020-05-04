<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="color:red;text-align:center">Welcome to Student Registration</h1>

<form:form method="POST" modelAttribute="box">
	Check box : <form:checkbox path="box"/><form:errors path="box"/></b><br>
	<input type="submit" value="submit">
</form:form>

<c:if test="${!empty stuResult }">
Result :: ${stuResult}
</c:if>