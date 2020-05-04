<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 style="color: red; text-align: center">Student Details</h1>
<form:form method="POST" commandName="studCommand">
Student No :: <form:input path="sno" />
	<br>
Student Name :: <form:input path="name" />
	<br>
Student Qualification :: <form:select path="qualification">
<%-- <form:option items="${quliList}"/> --%>
<form:options items="${quliList}"/>
</form:select>
	<br>
Student Course ::<form:select path="courses" multiple="yes">
		<form:options items="${courseList}" />
	</form:select>
	<br>
Student Hobbies ::<form:checkboxes items="${hobbiList }" path="hobbi"/>
		
	<br>
	<input type="submit" value="register">
</form:form>