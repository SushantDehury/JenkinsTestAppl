<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="text-align: center; color: red">Student Form page</h1>
<br>
<form:form method="POST" modelAttribute="stCmd">
<p style="color:red"><form:errors  path="*" /></p><br>
Student no:: <form:input path="no" />
	<br>
Student name::<form:input path="name" />
	<br>
Student course::<form:checkboxes path="course" items="${stCourse}"/><br>
		
Gender :: <form:select path="gender">
		<form:options items="${stGender}" />
	</form:select>
	<br>
Student DOB ::<form:input path="dob" />
	<b style="color: red">(dd-MM-yyyy)</b>
	<br>
	<input type="hidden" name="cToken" value="${serverToken}">
	<input type="submit" value="register">
</form:form>

<br>
<c:if test="${!empty result}">
String result:: ${result}
</c:if>