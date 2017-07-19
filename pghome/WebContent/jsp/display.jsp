<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Page</title>
</head>
<body>
	<table>
		<tr>
			<td>firstName</td>
			<td>surName</td>
			<td>admissionNumber</td>
			<td>mobile</td>
			<td>homeMobile</td>
			<td>dateOfBirth</td>
			<td>identityCardType</td>
			<td>idendityNumber</td>
			<td>address</td>
			<td>age</td>
			<td>gender</td>
			<td>organization</td>
			<td>dateOfAdminssion</td>
			<td>employmentType</td>
			<td>monthlyRent</td>
			<td>advanceAmount</td>
			<td>photo</td>
		</tr>


		<c:forEach var="guestAll" items="${guestAllList}">
			<tr>
				<td><c:out value="${guestAll.firstName }" /></td>
				<td><c:out value="${guestAll.surName }" /></td>
				<td><c:out value="${guestAll.admissionNumber }" /></td>
				<td><c:out value="${guestAll.mobile }" /></td>
				<td><c:out value="${guestAll.homeMobile }" /></td>
				<td><c:out value="${guestAll.dateOfBirth }" /></td>
				<td><c:out value="${guestAll.identityCardType }" /></td>
				<td><c:out value="${guestAll.idendityNumber }" /></td>
				<td><c:out value="${guestAll.address }" /></td>
				<td><c:out value="${guestAll.age }" /></td>
				<td><c:out value="${guestAll.gender }" /></td>
				<td><c:out value="${guestAll.organization }" /></td>
				<td><c:out value="${guestAll.dateOfAdminssion }" /></td>
				<td><c:out value="${guestAll.employmentType }" /></td>
				<td><c:out value="${guestAll.monthlyRent }" /></td>
				<td><c:out value="${guestAll.advanceAmount }" /></td>
				<td><c:out value="${guestAll.photo }" /></td>

			</tr>


		</c:forEach>
	</table>
</body>
</html>