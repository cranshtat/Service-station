<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/header.jspf" %>
<div class="container">
    <div class="row">
        <h3 class="text-center">Cart Client</h3>
        <table class="table">
            <tr>
                <th>Name</th>
                <th>Surname</th>
                <th>Birthday</th>
                <th>Address</th>
                <th>Phone</th>
                <th>Email</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="val" items="${cartClient}">
                <tr>
                    <td>${val.getName()}</td>
                    <td>${val.getSurname()}</td>
                    <td>${val.getBirthday()}</td>
                    <td>${val.getAddress()}</td>
                    <td>${val.getPhone()}</td>
                    <td>${val.getEmail()}</td>
                    <td><a class="btn btn-default" href="updateclient?&idclient=${val.getIdKlient()}&name=${val.getName()}&surname=${val.getSurname()}
                           &birthday=${val.getBirthday()}&address=${val.getAddress()}&phone=${val.getPhone()}&email=${val.getEmail()}">Update client</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div class="row">
        <h3 class="text-center">Avto Client</h3>
        <table class="table table-striped">
           <tr>
               <th>Make</th>
               <th>Model</th>
               <th>Year</th>
               <th>VIN</th>
               <th>Actions</th>
           </tr>
           <c:forEach var="val" items="${listAvtoToClient}">
               <tr>
                   <td>${val.getMake()}</td>
                   <td>${val.getModel()}</td>
                   <td>${val.getYear()}</td>
                   <td>${val.getVIN()}</td>
                   <td>
                       <a class="btn btn-default" href="orderavto?id=${val.getIdAvto()}">Orders</a>
                       <a class="btn btn-default" href="delavto?id=${val.getIdAvto()}&idklient=${val.getIdKlient()}">Delete Avto</a>
                       <a class="btn btn-default" href="upavto?id=${val.getIdAvto()}&make=${val.getIdKlient()}&model=${val.getModel()}&year=${val.getYear()}&vin=${val.getVIN()}&idklient=${id}">Update Avto</a>
                   </td>
               </tr>
           </c:forEach>
        </table>
        <a class="btn btn-default" href="regavto?id=${id}">Add avto</a>
    </div>
    <div class="row text-right">
        <a class="btn btn-default" href="index">To main</a>
        <a class="btn btn-default" href="<c:url value='clients'/>">Back</a>
    </div>
</div>
<%@include file="../jspf/footer.jspf" %>