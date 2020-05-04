<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="text-align: center; color: blue">Welcome to Student Registration</h1>
	
<form:form method="POST" commandName="studentComd">
 	Student name :<form:input path="sname"/> 
 	&nbsp<b><form:errors style="color:red" path="sname"/></b> <br>
 	Student address :<form:input path="ardss"/>&nbsp<b><form:errors style="color:red" path="ardss"/></b><br>
 	Student Course :<form:input path="cource"/> &nbsp<b><form:errors style="color:red" path="cource"/></b><br>
 	Student age :<form:input path="age"/> &nbsp<b><form:errors style="color:red" path="age"/></b><br>
 	<input type="submit" value="register"> 
</form:form>