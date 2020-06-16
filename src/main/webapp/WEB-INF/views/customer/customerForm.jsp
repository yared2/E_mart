<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <h2 style="text-align: center;">Customer Registration Form</h2>
    <hr>
    <form:form action="addCustomer" method="post" modelAttribute="newCustomer" >
       <div class="form-row">
              <div class="form-group col-md-6">
                <label for="firstName">First Name</label>
                <form:input  type="text" class="form-control" id="lastName"   path="firstName"/>
            </div>
            <div class="form-group col-md-6">
                <label for="lastName">Last Name</label>
                <form:input type="text" class="form-control" id="lastName" path="lastName" />
            </div>
        </div>
        <h3>Payment Type</h3><br>
        <div class="form-group col-md-6">
            <label for="payment">card Type</label>
            <form:input type="text" class="form-control" id="payment.cardType" path="payment.cardType"/>
        </div>
        <div class="form-group col-md-6">
            <label for="payment">Name on card</label>
            <form:input type="text" class="form-control" id="payment.cartNumber" path="payment.cartNumber"/>
        </div>
         <div class="form-group col-md-6">
            <label for="payment">nameOnCard</label>
            <form:input type="text" class="form-control" id="payment.nameOnCard" path="payment.nameOnCard"/>
        </div>
        
        <div class="form-group col-md-6">
            <label for="payment">Card Expire Date</label>
            <form:input type="text" class="form-control" id="payment.cardExpireDate" path="payment.cardExpireDate"/>
        </div>
        <div>
            <div class="form-group col-md-4">
                <label for="acredential.userName">UserName</label>
                <form:input type="text" class="form-control" id="acredential.userName" path="acredential.userName"/>
            </div>
            <div class="form-group col-md-4">
                <label for="acredential.password">password</label>
                <form:input type="password" class="form-control" id="acredential.password" path="acredential.password"/>
            </div>
        </div>
        <h3>Address </h3>
      
        <div style="padding-left: 20px;">
            <div class="form-group col-sm-2">
                <label for="address.street">Street</label>
                <form:input type="text" class="form-control" id="address.street" path="address.street"/>
            </div>
            <div class="form-row">
                <div class="form-group col-sm-2">
                    <label for="address.city">City</label>
                    <form:input type="text" class="form-control" id="address.city" path="address.city"/>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-2">
                    <label for="address.state">state</label>
                    <form:input type="text" class="form-control" id="address.state" path="address.state"/>
                </div>
                <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="address.zipCode">Zip Code</label>
                    <form:input type="text" class="form-control" id="address.zipcode" path="address.zipcode"/>
                </div>
            </div> 
            
        </div>

        </div>
<button type="submit" class="btn btn-primary">Register</button>
    </form:form>