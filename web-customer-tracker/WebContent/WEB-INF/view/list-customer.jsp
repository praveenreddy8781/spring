<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<title>List Customers</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
</head>

<body>
	<div id="wrapper">

		<div id="header">
			<h2>CRM- Customer Relationship Manager</h2>
		</div>
	</div>
	
	<hr>
	
	<div id="container">
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
			</tr>

			<c:forEach var="tempCustomers" items="${customers}">
				<tr>
					<td>${tempCustomers.firstName}</td>
					<td>${tempCustomers.lastName}</td>
					<td>${tempCustomers.email}</td>
				</tr>
			</c:forEach>

		</table>
	</div>

</body>
</html>