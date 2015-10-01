<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/header.jspf" %>
<div class="container">
    <div class="row">
        <h3 class="text-center">Clients</h3>
        <table class="table">
            <tr>
                <th>Name and Surname</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="val" items="${listClients}">
                <tr>
                    <td>
                        <a href="cartclient?id=${val.getIdKlient()}">${val.getName()} ${val.getSurname()}</a>

                    </td>
                    <td> 
                        <a class="btn btn-default" href="delclient?id=${val.getIdKlient()}">Delete client</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div class="row text-right"><a class="btn btn-default" href="index">Back</a></div>
</div> 
<%@include file="../jspf/footer.jspf" %>
