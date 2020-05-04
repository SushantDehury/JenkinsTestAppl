<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<body bgcolor="#1AE5E0">
	<h1 style="text-align: center; color: white"><marquee behavior="alternate">EDIT STUDENT DETAILS</marquee></h1>
	<h1 style="text-align: center; color: white">==============================</h1>
	<center>
		<table border="2">
			<form:form method="POST" commandName="stuCmd">
				<tr>
					<td><b font color="white">Student NO</b>
					<td><b font color="white"><form:input path="sid"
								disabled="true" /></td>
					<td><b font color="white">Student Name</b>
					<td><b font color="white"><form:input path="sname" /></td>
					<td><b font color="white">Student Address</b>
					<td><b font color="white"><form:input path="ards" /></td>
					<td><b font color="white">Student Course</b>
					<td><b font color="white"><form:input path="course" /></td>
				</tr>
		</table>
		<br> <input type="submit" value="update">
		</form:form>
		<br>
		<br>
		<br> <a href="welcome.html">HOME</a>
	</center>
</body>