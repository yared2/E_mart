
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h2 style="text-align: center;">List Products for Admin</h2>
<hr>
<div style="float: right;">
	<a class="btn btn-secondary"
		href="<spring:url value="/admin/products"></spring:url>"> Add New Product </a>
</div>

<br>
<br>
<br>
<div class="form-row">
	
	
		<table class="table table-striped">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="admin" items="${admins}">
				<tr>
					<td>${admin.firstName}</td>
					<td>${admin.lastName}</td>
					<td>
					<a href="<spring:url value="/admin/admins/edit/${admin.adminId}"></spring:url>"class="btn btn-secondary">Edit</a> 
					<a href="<spring:url value="/admin/admins/delete/${admin.adminId}"></spring:url>" class="btn btn-danger">Delete</a>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</div>

