<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="st"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<form:form action="/pghome/registration.htm" method="post"
		modelAttribute="guest">
		<table>
			<tr>
				<td>FirstName</td>
				<td>SurName</td>
			</tr>
			<tr>
				<td><form:input path="firstName" /></td>
				<td><form:input path="surName" /></td>
			</tr>

			<tr>
				<td>AdmissionNumber</td>
				<td>MobileNumber</td>
			</tr>
			<tr>
				<td><form:input path="admissionNumber" /></td>
				<td><form:input path="mobile" /></td>
			</tr>
			<tr>
				<td>homeMobile</td>
				<td>dateOfBirth</td>
			</tr>
			<tr>
				<td><form:input path="homeMobile" /></td>
				<td><form:input path="dateOfBirth" /></td>
			</tr>

			<tr>
				<td>identityCardType</td>
				<td>idendityNumber</td>

			</tr>
			<tr>
				<td><form:input path="identityCardType" /></td>
				<td><form:input path="idendityNumber" /></td>

				<%-- <td><form:radiobutton path="gender" value="male" />Male <form:radiobutton
									path="gender" value="female" />Female</td>
							<td><form:input path="emergencyContact" /></td> --%>
			</tr>
			<tr>
				<td>address</td>
				<td>age</td>
			</tr>
			<tr>
				<td><form:input path="address" /></td>
				<td><form:input path="age" /></td>

				<%-- <td><form:radiobutton path="employment" value="yes" />Yes <form:radiobutton
									path="employment" value="no" />No</td>
							<td><form:input path="panNumber" /></td> --%>
			</tr>

			<tr>
				<td>gender</td>
				<td>organization</td>
			</tr>
			<tr>
				<td><form:input path="gender" /></td>
				<td><form:input path="organization" /></td>
			</tr>
			<tr>
				<td>dateOfAdminssion</td>
				<td>employmentType</td>
			</tr>
			<tr>
				<td><form:input path="dateOfAdminssion" /></td>
				<td><form:input path="employmentType" /></td>
			</tr>
			<tr>
				<td>monthlyRent</td>
				<td>advanceAmount</td>
			</tr>
			<tr>
				<td><form:input path="monthlyRent" /></td>
				<td><form:input path="advanceAmount" /></td>
			</tr>
			<tr>
				<td>photo</td>
			</tr>
			<tr>
				<td><form:input path="photo" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>