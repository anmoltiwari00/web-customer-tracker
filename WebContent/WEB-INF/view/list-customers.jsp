<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head><title>Customer Relation</title></head>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>



<body>

<div id="wrapper">
	<div id="header">
		<h2>Customer Relationship Manager</h2>
	</div>
	
	<input type="button" value="Add a new Customer" onclick="window.location.href='showForm'; return false;" class="add-button"/>
	
	<div id="content">
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Action</th>
				<th>Remove</th>
			</tr>
			
			<c:forEach var="tempCustomer"  items="${customers}" >
			
			<c:url var="updateurl" value="/customer/showFormForUpdate">
				<c:param name="customerId" value="${tempCustomer.id}"/>
			</c:url>
			
			<c:url var="deleteCustomer" value="/customer/deletedCustomer">
				<c:param name="customerdeleteId" value="${tempCustomer.id}"/>
			</c:url>
				<tr>
					<td>${tempCustomer.firstName}</td>
					<td>${tempCustomer.lastName}</td>
					<td>${tempCustomer.email}</td>
					<td><a href="${updateurl}">Update</a></td>
					<td><a href="${deleteCustomer}">Delete</a></td>
				</tr>
				
			</c:forEach>
		</table>
	</div>
</div>

</body>
</html>