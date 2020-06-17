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

<br>
<br>
<br>

<div>
	<img class="card-img-top" src="<spring:url value="/images/shoe.jpeg"/>"
		alt="Image">
	<h5 class="card-title">${product.productName}</h5>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Comment</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="review" items="${reviews}">
				<tr>
					<td>${review.comment }</td>
					<td><a
						href="<spring:url value="/admin/products/edit?id=${product.productId}"></spring:url>"
						class="btn btn-secondary">Edit</a> <a
						href="<spring:url value="/admin/products/delete/${product.productId}"></spring:url>"
						class="btn btn-danger">Delete</a> <a
						href="<spring:url value="/admin/products/comments/${product.productId}"></spring:url>"
						class="btn btn-danger">comments</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div> --%>