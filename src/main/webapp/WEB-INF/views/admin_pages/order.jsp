
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2 style="text-align: center;">List of Orders</h2>
<hr>
<br>
<br>
<br>
<div class="container">

  <table class="table table-striped">
    <thead>
      <tr>
        <th>Order Number</th>
        <th>Order Date</th>
   <!--      <th>Order Status</th> -->
        <th>Shipped Date</th>
        <th>Shipper</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="order" items="${orders}">
        <tr>
          <td>${order.orderNumber}</td>
          <td>${order.orderDate}</td>
         <%--  <td>${order.orderStatus}</td> --%>
          <td>${order.shippedDate}</td>
          <td>${order.shipper}</td>
          <td><a
            href="<spring:url value="/admin/products/comments/${order.orderId}"></spring:url>"
            class="btn btn-secondary">do something</a></td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</div>