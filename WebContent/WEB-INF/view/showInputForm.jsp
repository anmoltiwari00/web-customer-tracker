<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<title>Add Customer</title>

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css "/>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css "/>


</head>

<body>

<div id="head">
	<h2>CRM....Add/update a Customer</h2>
</div>

	<form:form action="saveCustomer"  modelAttribute="customer" method="POST">
	
		<!-- To associate customer data with id -->
		<form:hidden path="id" />
		
		
		<label>First Name:</label>
		<form:input path="firstName" type="text" name="firstName"/>
		
		<label>Last Name:</label>
		<form:input path="lastName" type="text" name="lastName"/>	
		
		<label>Email:</label>
		<form:input path="email" type="email" name="email"/>		
		
		<input type="submit" value="Save" id="save"/>
		
		
	</form:form>
	
	
		<a href="${pageContext.request.contextPath}/customer/list">Back to list</a>
	



</body>


</html>