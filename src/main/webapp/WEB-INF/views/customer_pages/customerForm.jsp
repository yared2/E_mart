<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container">
    <div class="row centered-form">
        <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Customer Registration Form</h3>
                </div>
                <div class="panel-body">
                     <form:form action="addCustomer" method="post" modelAttribute="newCustomer" >
                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <form:input  type="text" class="form-control" id="lastName"   path="firstName" placeholder="first name"/>
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <form:input type="text" class="form-control" id="lastName" path="lastName" placeholder="lastName" />
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                           <form:input type="text" class="form-control" id="payment.nameOnCard" path="payment.nameOnCard" placeholder="nameOnCard"/>
                        </div>
                         <div class="form-group">
                          <form:input type="text" class="form-control" id="payment.cartNumber" path="payment.cartNumber" placeholder="cartNumber"/>
                        </div>
                           <div class="form-group">
                          <form:input type="text" class="form-control" id="payment.cardType" path="payment.cardType" placeholder="cardType"/>
                        </div>

                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <form:input type="text" class="form-control" id="payment.cardExpireDate" path="payment.cardExpireDate" placeholder="cardExpireDate"/>
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                  <form:input type="text" class="form-control" id="payment.ccv" path="payment.ccv" placeholder="ccv"/>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <form:input type="password" class="form-control" id="acredential.password" path="acredential.password" placeholder="password"/>
                                </div>
                            </div>
                            
                            </div>
                        </div>


                        <div class="form-group">
                        <form:input type="text" class="form-control" id="address.street" path="address.street" placeholder="street"/>
                        </div>

                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <form:input type="text" class="form-control" id="address.city" path="address.city" placeholder="city" />
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <form:input type="text" class="form-control" id="address.zipcode" path="address.zipcode" placeholder="zipcode" />
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                     <form:input type="text" class="form-control" id="address.state" path="address.state"  placeholder="state" />
                                </div>
                            </div>
                        </div>


                        <input type="submit" value="Register" class="btn btn-primary btn-block">

                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
