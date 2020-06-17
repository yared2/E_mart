<<<<<<< HEAD

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h2 style="text-align: center;">Customers' Comments on
	${product.productName}</h2>
<hr>
=======
<%-- 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h2 style="text-align: center;">List of Comments of a Product</h2>
<hr>
<div style="float: right;">
	<a class="btn btn-secondary"
		href="<spring:url value="/admin/products"></spring:url>"> Add New
		Product </a>
</div>
>>>>>>> 27fec0bcc92e59cf2ea3c2a5100206473dc9f03f

<br>
<br>
<br>
<<<<<<< HEAD
<div class="container">
	<%-- <h3 class="card-title" style="text-align:center;">${product.productName}</h3> --%>
	<img width="200px" height="300px" class="card-img-top"
		src="<spring:url value="${product.productImagePath}"/>" alt="Image">

=======

<div>
	<img class="card-img-top" src="<spring:url value="/images/shoe.jpeg"/>"
		alt="Image">
	<h5 class="card-title">${product.productName}</h5>
>>>>>>> 27fec0bcc92e59cf2ea3c2a5100206473dc9f03f
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Comment</th>
<<<<<<< HEAD
				<th>Action</th>
=======
				<th></th>
>>>>>>> 27fec0bcc92e59cf2ea3c2a5100206473dc9f03f
			</tr>
		</thead>
		<tbody>
			<c:forEach var="review" items="${reviews}">
				<tr>
<<<<<<< HEAD
					<td>${review.comment}</td>
					<td><a
						href="<spring:url value="/admin/products/comments/${product.productId}"></spring:url>"
						class="btn btn-secondary">do something</a></td>
=======
					<td>${review.comment }</td>
					<td><a
						href="<spring:url value="/admin/products/edit?id=${product.productId}"></spring:url>"
						class="btn btn-secondary">Edit</a> <a
						href="<spring:url value="/admin/products/delete/${product.productId}"></spring:url>"
						class="btn btn-danger">Delete</a> <a
						href="<spring:url value="/admin/products/comments/${product.productId}"></spring:url>"
						class="btn btn-danger">comments</a></td>
>>>>>>> 27fec0bcc92e59cf2ea3c2a5100206473dc9f03f
				</tr>
			</c:forEach>
		</tbody>
	</table>
<<<<<<< HEAD
</div>
=======
</div> --%>
>>>>>>> 27fec0bcc92e59cf2ea3c2a5100206473dc9f03f
