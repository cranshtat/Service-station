<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/header.jspf" %>
    <div class="container">
        <div class="row">
        <h3 class="text-center">Update cars to the client</h3>
        <form method="POST" action="upavto" class="form-horizontal">
            <div class="form-group">
                <label for="exampleInputName"> Make</label>
                <input class="form-control" type="text" name="make" value="${make}" id="exampleInputName" placeholder="make" required>
            </div>
            <div class="form-group">
                <label for="exampleInputModel"> Model</label>
                <input class="form-control" type="text" name="model" value="${make}" id="exampleInputModel" placeholder="model" required>
            </div>
            <div class="form-group">
                <label for="exampleInputYear"> Year</label>
                <input class="form-control" type="number" name="year" value="${year}" min="1950" max="2015" id="exampleInputYear" placeholder="model" required>
            </div>
            <div class="form-group">
                <label for="exampleInputVIN"> VIN</label>
                <input class="form-control" type="text" name="vin" value="${vin}" id="exampleInputVIN" placeholder="model" required>
            </div>
            <input type="hidden" name="idavto" value="${idavto}"/>
            <input type="hidden" name="idklient" value="${idklient}"/>
            <input class="btn btn-default" type="submit" value="Update avto"/>
        </form>
        </div>
    </div>

<%@include file="../jspf/footer.jspf" %>
