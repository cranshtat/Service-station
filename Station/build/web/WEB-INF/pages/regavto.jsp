<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/header.jspf" %>
    <div class="container">
        <div class="row">
        <h3 class="text-center">Adding cars to the client</h3>
        <form class="form-horizontal" method="POST" action="regavto">
            <div class="form-group">
                <label for="exampleInputMake"> Make</label>
                <input type="text" class="form-control" name="make" id="exampleInputMake" placeholder="name" required>
            </div>
            <div class="form-group">
                <label for="exampleInputModel"> Model</label>
                <input type="text" class="form-control" name="model" id="exampleInputModel" placeholder="name" required>
            </div>
            <div class="form-group">
                <label for="exampleInputYear"> Year</label>
                <input type="number" class="form-control" name="year" min="1950" max="2015" id="exampleInputYear" placeholder="name" required>
            </div>
            <div class="form-group">
                <label for="exampleInputVIN"> VIN</label>
                <input type="text" class="form-control" name="vin" id="exampleInputVIN" placeholder="name" required>
            </div>
            <input type="hidden" name="id" value="${id}"/>
            <input class="btn btn-default btn-lg" type="submit" value="Add avto"/>
        </form>
        </div>
    </div>

<%@include file="../jspf/footer.jspf" %>