<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<form:form action="/e-mart/customer/products/comment/${id}" method="POST" modelAttribute="review">

	<div class="form-group">
		<label for="comment">Comment </label>
		<form:input type="textarea" class="form-control" path="comment" />
		<form:errors path="comment" cssClass="error" />

		<form:hidden path="dateOfReview" />
	</div>
	<input id="submit" type="submit" value="Comment"/>

</form:form>