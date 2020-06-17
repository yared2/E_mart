
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h2 style="text-align: center;">List of Products for Customer</h2>
<hr>
<br>
<br>
<br>
<div class="form-row">
	<c:forEach var="product" items="${products}">
		<div class="card" style="width: 18rem;">
			<img class="card-img-top" src="<spring:url value="/images/shoe.jpeg"/>" alt="Image">
			<div class="card-body">
				<h5 class="card-title">${product.productName}</h5>
				<p class="card-text">${product.description }</p>
				<a href="#" class="btn btn-secondary">Add to Cart</a>
			</div> 
		</div> 
</c:forEach>
</div>
 