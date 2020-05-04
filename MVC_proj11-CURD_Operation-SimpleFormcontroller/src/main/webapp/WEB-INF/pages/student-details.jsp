<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<body bgcolor="#1AE5E0">
	<h1 style="text-align: center; color: white"><marquee behavior="alternate">ALL  STUDENT  DETAILS</marquee></h1>
	<h1 style="text-align: center; color: white">==============================</h1>
	<center>
		<c:choose>
			<c:when test="${!empty studentDetails}">
				<table border="1" bordercolor="white">
					<tr>
						<th font color="sliver">Student No</th>
						<th color="white">Student Name</th>
						<th color="white">Student Ardress</th>
						<th color="white">Student Course</th>
						<th color="white">Edit</th>
					</tr>
					<c:forEach var="dto" items="${studentDetails}">
						<tr>
							<td color="white">${dto.sid}</td>
							<td color="white">${dto.sname}</td>
							<td color="white">${dto.ards}</td>
							<td color="white">${dto.course}</td>
							<td color="white"><a href="stuEdit.htm?sno=${dto.sid}">Edit</a>&nbsp&nbsp&nbsp<a
								href="stuDelete.htm?sno=${dto.sid}">Delete</a></td>
						</tr>
						</c:forEach>
			</c:when>
			<c:otherwise>
				<h1 color=white>Record not found...</h1>
			</c:otherwise>
		</c:choose>
				</table>
				
		<br>
		<c:if test="${!empty result}">
			<h2 style="color: white">${result}</h2>
		</c:if>
		<br> <a href="welcome.html">HOME</a>
	</center>
</body>