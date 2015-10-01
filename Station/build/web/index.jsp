<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/jspf/header.jspf" %>

<div class="container">
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <ul class="text-center list-inline list-index">
                <li><a class="btn btn-default btn-lg" href="<c:url value='registration'/>">Registration new client</a></li>
                <li><a class="btn btn-default btn-lg" href="<c:url value='clients'/>">View all clients</a></li>
            </ul>             
        </div>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12"> 
            <h3 class="text-center">Enter name and surname client:</h3>
            <form class="text-center form-inline" method="POST" action="search">
            <div class="form-group">
              <label for="exampleInputName">Enter Name</label>
              <input type="text" class="form-control" name="name" id="exampleInputName" placeholder="name" required>
            </div>
            <div class="form-group">
              <label for="exampleInputSurname">Enter Surname</label>
              <input type="text" class="form-control" name="surname" id="exampleInputSurname" placeholder="name" required>
            </div>
            <input type="submit" class="btn btn-default" value="Search client"/>
            </form>
        </div>
    </div>
</div>
<%@include file="WEB-INF/jspf/footer.jspf" %>