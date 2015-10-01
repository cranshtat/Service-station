<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/header.jspf" %>
<div class="container">
    <div class="row">
        <table class="table table-striped">
            <tr>
                <th>Date order</th>
                <th>Sum</th>
                <th>Status</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="val" items="${listOrderAvto}">
                <tr>
                    <td>${val.getDateOrder()}</td>
                    <td>${val.getSum()}</td>
                    <td>${val.getStatus()}</td>
                    <td>
                        <a class="btn btn-default" href="delorderavto?idord=${val.getIdOrder()}&idavto=${val.getIdAvtoOrder()}" >Delete order avto</a>
                        <a class="btn btn-default" href="updateorder?idavto=${val.getIdAvtoOrder()}&date=${val.getDateOrder()}&sum=${val.getSum()}&status=${val.getStatus()}&idord=${val.getIdOrder()}" >Update order avto</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12"> 
            <h3 class="text-center">Add order</h3>
            <form class="text-center form-inline" method="POST" action="orderavto">
            <div class="form-group">
              <label for="exampleInputDate">Enter Dte</label>
              <input type="date" class="form-control" name="date" id="exampleInputDate" required>
            </div>
            <div class="form-group">
              <label for="exampleInputSurname">Enter Sum</label>
              <input type="number" class="form-control" name="sum" min="0" max="10000" id="exampleInputSurname" placeholder="sum" required>
            </div>
            <div class="form-group">
              <label for="exampleInputSurname">Enter Status</label>
              <select name="status" class="form-control">
                    <option value="1">Completed</option>
                    <option value="2">In Progress</option>
                    <option value="3">Cancelled</option>
                </select>
            </div>
            <input type="hidden" name="id" value="${idavto}"/>
            <input type="submit" class="btn btn-default" value="Add order"/>
            </form>
        </div>
         <div class="row text-right">
            <a class="btn btn-default" href="index">To main</a>
        </div>
    </div>
</div>
<%@include file="../jspf/footer.jspf" %>
