<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="container">
	<form:form modelAttribute="credential" action="login" method="post">
		<fieldset>
			<h3 style="text-align:center;">Log in</h3>
			<div class="form-group">
				<label for="username">Username</label>
				<form:input type="text" class="form-control" path="userName"
					placeholder="Enter Username" />
				<small id="username" class="form-text text-muted">We'll
					never share your email with anyone else.</small>
			</div>
			<div class="form-group">
				<label for="password">Password</label>
				<form:input type="password" class="form-control" path="password"
					placeholder="Password" />
			</div>
			<input type="submit" class="btn btn-primary" value="Login" />
		</fieldset>
	</form:form>
</div>
