<h2 style="text-align: center;"> Admin Registration Form</h2>
<hr>
<form action="" method="POST">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="firstName">First Name</label>
      <input type="text" class="form-control" id="firstName" >
    </div>
    <div class="form-group col-md-6">
      <label for="lastName">Last Name</label>
      <input type="text" class="form-control" id="lastName">
    </div>
  </div>
  <div class="form-group">
    <label for="credential.userName">User Name</label>
    <input type="text" class="form-control" id="role" placeholder="eg. Alex">
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="credential.password">password</label>
      <input type="text" class="form-control" id="credential">
    </div>
    </div>
    <h3>Address</h3>
    <div class="form-group col-md-2">
      <label for="Street"></label>
      <input type="text" class="form-control" id="address.street" placeholder="Street">
    </div>
     <div class="form-group col-md-2">
      <label for="City"></label>
      <input type="text" class="form-control" id="address.city" placeholder="City">
    </div>
  <div class="form-group col-md-2">
      <label for="State"></label>
      <input type="text" class="form-control" id="address.state" placeholder="State">
    </div>
 <div class="form-group col-md-2">
      <label for="ZipCode"></label>
      <input type="text" class="form-control" id="address.zipCode" placeholder="ZipCode">
    </div>
 
  <button type="submit" class="btn btn-primary">Register</button>
</form>
