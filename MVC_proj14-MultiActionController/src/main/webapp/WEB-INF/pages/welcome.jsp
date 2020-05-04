<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 style="color: blue; text-align: center">Welcome to Employee
	page</h1>
<form action="register.htm" method="post">
	<br> Employee NO :: <input type="text" name="sno"><br>
	Employee Name :: <input type="text" name="sname"><br>
	Employee Addres :: <input type="text" name="adrs"><br> <input
		type="submit" value="insert" name="rp">&nbsp <input
		type="submit" value="update" name="rp">&nbsp <input
		type="submit" value="delete" name="rp">&nbsp <input
		type="submit" value="get" name="rp">&nbsp <input type="submit"
		value="invalid" name="rp1">
</form>
<br>
<c:if test="${!empty empComd}">
Result :; ${empComd}
</c:if>


