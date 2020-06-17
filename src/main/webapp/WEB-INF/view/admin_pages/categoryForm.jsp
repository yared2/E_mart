<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h2 style="text-align: center;">Add New Category Form</h2>
<hr>
<form:form modelAttribute="category" action="categories" method="POST">
	
		<div class="form-group col-md-6">
			<label for="categoryName">Category Name</label>
			<form:input type="text" class="form-control" path="categoryName" />
			<form:errors path="categoryName" cssClass="error"/>
		</div>
		
	<input type="submit" class="btn btn-primary" value="Add Category" />
</form:form>