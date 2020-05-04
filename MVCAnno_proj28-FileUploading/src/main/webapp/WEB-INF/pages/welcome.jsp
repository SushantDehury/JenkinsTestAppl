<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="text-align: center; color: red">Student Form page</h1>
<br>
<form:form method="POST" modelAttribute="fileCmd"
	enctype="multipart/form-data">
Upload file1 :: <input type="file" name="file1">
	<br>
Upload file2 :: <input type="file" name="file2">
	<br>
	<input type="submit" value="upload">
</form:form>
