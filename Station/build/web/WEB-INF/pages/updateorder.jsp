<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/header.jspf" %>
<div class="container">
    <div class="row">
        <form class="form-horizontal" method="POST" action="updateorder">
            <div class="form-group">
                <label for="exampleInputMake"> Date</label>
                <input class="form-control" type="date"  name="date" value="${dateorder}" id="exampleInputMake" placeholder="name" required>
            </div>
            <div class="form-group">
                <label for="exampleInputMake"> Sum</label>
                <input class="form-control" type="number" name="sum" min="0" max="10000" value="${sum}" id="exampleInputMake" placeholder="name" required>
            </div>
            <div class="form-group">
                <label for="exampleInputMake"> Status</label>
                <select class="form-control" name="status">
                    <c:choose>
                        <c:when test="${status.equals('Completed')}">
                           <option selected value="1">Completed</option>
                           <option value="2">In Progress</option>
                            <option value="3">Cancelled</option>
                        </c:when>
                        <c:when test="${status.equals('In Progress')}">
                            <option value="1">Completed</option>
                           <option selected value="2">In Progress</option>
                            <option value="3">Cancelled</option>
                        </c:when>
                         <c:when test="${status.equals('Cancelled')}">
                            <option value="1">Completed</option>
                           <option value="2">In Progress</option>
                            <option selected value="3">Cancelled</option>
                        </c:when>
                    </c:choose>
                </select>
            </div>
            <input type="hidden" name="id" value="${idavto}"/>
            <input type="hidden" name="idorder" value="${idorder}"/>
            <input class="btn btn-default" type="submit" value="Update order"/>
        </form>
        </div>
    </div>

<%@include file="../jspf/footer.jspf" %>
