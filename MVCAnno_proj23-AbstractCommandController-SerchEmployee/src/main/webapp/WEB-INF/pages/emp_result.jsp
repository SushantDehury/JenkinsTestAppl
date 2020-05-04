<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="text-align: center; color: blue">Employee Details</h1>
<h1 style="text-align: center; color: blue">============================</h1>

<c:choose>
	<c:when test="${!empty listEmp}">
		<table border="1">
			<tr>
				<th>Employee No</th>
				<th>Employee Name</th>
				<th>Employee Job</th>
				<th>Employee salary</th>
				<th>Employee mgr</th>
				<th>Employee Department No</th>
			</tr>
			<c:forEach var="dto" items="${listEmp}">
				<tr>
					<td>${dto.empno}</td>
					<td>${dto.ename}</td>
					<td>${dto.job}</td>
					<td>${dto.sal}</td>
					<td>${dto.mgr}</td>
					<td>${dto.deptno}</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		Record Not Found....&nbsp;&nbsp;
	</c:otherwise>
</c:choose>
<a href="home.htm">HOME</a>


