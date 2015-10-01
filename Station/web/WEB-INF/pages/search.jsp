<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/header.jspf" %>
<div class="container">
    <div class="row">
        <h3 class="text-center">Searching results</h3>
        <table class="table">
            <tr>
                <th>Name and Surname</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="val" items="${listClientsSearch}">
                <tr>
                    <td>
                        <a href="cartclient?id=${val.getIdKlient()}">${val.getName()} ${val.getSurname()}</a>
                        
                    </td>
                    <td>
                        <a href="cartclient?id=${val.getIdKlient()}">Update client</a> | 
                        <a href="delclient?id=${val.getIdKlient()}">Delete client</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        </div>
    </div>

<%@include file="../jspf/footer.jspf" %>