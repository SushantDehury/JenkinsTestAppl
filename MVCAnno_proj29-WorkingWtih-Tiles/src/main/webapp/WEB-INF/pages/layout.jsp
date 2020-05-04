<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
</html>
<body>
	<table width="100%" height="100%" border="1">
		<tr bgcolor="blue">
			<td height="20%" colspan="2"><tiles:insertAttribute name="header" /></td>
		</tr>
		<tr bgcolor="blue">
			<td height="70%" width="30%"><tiles:insertAttribute name="menu" /></td>

			<td height="60%" width="70%" bgcolor="white"><tiles:insertAttribute
					name="body" /></td>
		</tr>
		<tr bgcolor="blue">
			<td height="10%" colspan="2"><tiles:insertAttribute name="footer" /></td>
		</tr>
	</table>
</body>