<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<title>Add Customer</title>

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css "/>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css "/>


</head>

<body>

<div id="head">
	<h2>CRM....Add a new Customer</h2>
</div>

	<form:form action="saveCustomer"  modelAttribute="customer" method="POST">
		
		<label for="firstName">First Name:</label>
		<input type="text" name="firstName"/>
		
		<label for="lastName">Last Name:</label>
		<input type="text" name="lastName"/>	
		
		<label for="email">Email:</label>
		<input type="email" name="email"/>		
		
		<input type="submit" value="Save" id="save"/>
		
		
	</form:form>
	
	
		<a href="${pageContext.request.contextPath}/customer/list">Back to list</a>
	



</body>


</html>