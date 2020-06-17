
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h2 style="text-align: center;">List of Comments On a Product</h2>
<hr>
<div style="float: right;">
	<a class="btn btn-secondary"
		href="<spring:url value="#"></spring:url>"> Do Something </a>
</div>

<br>
<br>
<br>
<div class="form-row">
	<c:forEach var="comment" items="${comments}">
		<div class="card" style="width: 18rem;">
			<img class="card-img-top"
				src="<spring:url value="/images/shoe.jpeg"/>" alt="Image">
			<div class="card-body">
				<h5 class="card-title">${product.productName}</h5>
				<p class="card-text">${product.description }</p>
				<a
					href="<spring:url value="/admin/products/edit?id=${product.productId}"></spring:url>"
					class="btn btn-secondary">Edit</a> <a
					href="<spring:url value="/admin/products/delete/${product.productId}"></spring:url>"
					class="btn btn-danger">Delete</a>
					 <a
					href="<spring:url value="/admin/products/comments/${product.productId}"></spring:url>"
					class="btn btn-danger">comments</a>
			</div>
		</div>
	</c:forEach>
</div>

