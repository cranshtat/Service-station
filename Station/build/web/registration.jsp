<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/jspf/header.jspf" %>

<div class="container">
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12"> 
            <h3 class="text-center">Registration client:</h3>
            <form class="form-horizontal" method="POST" action="registration">
            <div class="form-group">
              <label for="exampleInputName">Enter Name client</label>
              <input type="text" class="form-control" name="name" id="exampleInputName" placeholder="name" required>
            </div>
            <div class="form-group">
              <label for="exampleInputSurname">Enter Surname client</label>
              <input type="text" class="form-control" name="surname" id="exampleInputSurname" placeholder="name" required>
            </div>
            <div class="form-group">
              <label for="exampleInputBirthday">Enter Birthday client</label>
              <input type="date" class="form-control" name="birthday" id="exampleInputBirthday" required>
            </div>  
            <div class="form-group">
              <label for="exampleInputAddress">Enter Address client</label>
              <input type="text" class="form-control" name="address" id="exampleInputAddress" required>
            </div> 
            <div class="form-group">
              <label for="exampleInputPhone">Enter Phone client</label>
              <input type="tel" class="form-control" name="phone" id="exampleInputPhone" required>
            </div> 
            <div class="form-group">
              <label for="exampleInputEmail">Enter Email client</label>
              <input type="email" class="form-control" name="email" id="exampleInputEmail" required>
            </div>
            <input type="submit" class="btn btn-default btn-lg" value="Search client"/>
            <div class="row text-right"><a class="btn btn-default" href="index">Back</a></div>
            </form>
        </div>
    </div>
    
</div>

<%@include file="WEB-INF/jspf/footer.jspf" %>
