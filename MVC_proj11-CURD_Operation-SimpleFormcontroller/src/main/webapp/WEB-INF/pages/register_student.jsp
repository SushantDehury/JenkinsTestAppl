<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<body bgcolor="#1AE5E0">
	<h1 style="text-align: center; color: white">
		<marquee behavior="alternate">NEW STUDENT REGISTRATION</marquee>
	</h1>
	<h1 style="text-align: center; color: white">==============================</h1>
	<center>
		<br>
		<form:form method="POST" commandName="stuCmd">
		Student Name ::<form:input path="sname" />
			<br>
			<br>
		Student Adress ::<form:input path="ards" />
			<br>
			<br>
		Student Course::<form:input path="course" />
			<br>
			<br>
			<input type="submit" value="Register">
		</form:form>

	</center>
</body>
