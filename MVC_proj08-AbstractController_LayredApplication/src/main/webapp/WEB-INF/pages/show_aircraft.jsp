<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<h1 style="text-align: center; color: blue">INDIAN AIRFORCE</h1>
	<h1 style="text-align: center; color: blue">==========================</h1>

	<center>
		<c:choose>
			<c:when test="${!empty aircraftList}">
				<table border="1">
					<tr>
						<th>Aircraft-ID</th>
						<th>Aircraft Name</th>
						<th>Origin</th>
						<th>Type</th>
						<th>Total Aircraft</th>
					</tr>
					<c:forEach var="dto" items="${aircraftList}">
						<tr>
							<td>${dto.pid}</td>
							<td>${dto.name}</td>
							<td>${dto.origin}</td>
							<td>${dto.type}</td>
							<td>${dto.tolal}</td>
						</tr>
					</c:forEach>
				</table>
			</c:when>
			<c:otherwise>
				<h1>Record Not found...</h1>
			</c:otherwise>
		</c:choose>
		<h2 style="text-align: center; color: blue">
			<a href="home.htm">HOME</a>
		</h2>
	</center>