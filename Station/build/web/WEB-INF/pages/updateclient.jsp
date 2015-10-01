<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../jspf/header.jspf" %>
    <div class="container">
        <div class="row">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12"> 
                <h3 class="text-center">Update client:</h3>
                <form class="form-horizontal" method="POST" action="updateclient">
                <div class="form-group">
                  <label for="exampleInputName"> Name</label>
                  <input type="text" class="form-control" name="name" value="${name}" id="exampleInputName" placeholder="name" required>
                </div>
                <div class="form-group">
                  <label for="exampleInputSurname"> Surname</label>
                  <input type="text" class="form-control" name="surname" value="${surname}" id="exampleInputSurname" placeholder="surname" required>
                </div>
                <div class="form-group">
                  <label for="exampleInputBirthday"> Birthday</label>
                  <input type="date" class="form-control" name="birthday" value="${birthday}" id="exampleInputBirthday" placeholder="birthday" required>
                </div>
                <div class="form-group">
                  <label for="exampleInputAddress"> Address</label>
                  <input type="text" class="form-control"name="address" value="${address}" id="exampleInputAddress" placeholder="address" required>
                </div>
                <div class="form-group">
                  <label for="exampleInputPhone"> Phone</label>
                  <input type="text" class="form-control" name="phone" value="${phone}" id="exampleInputPhone" placeholder="phone" required>
                </div>
                <div class="form-group">
                  <label for="exampleInputEmail"> Email</label>
                  <input type="text" class="form-control" name="email" value="${email}" id="exampleInputEmail" placeholder="email" required>
                </div>
                <input type="hidden" name="idclient" value="${idclient}"/>
                <input type="submit" class="btn btn-default btn-lg" value="Update client"/>
                </form>
            </div>
                <div class="row text-right">
                    <a class="btn btn-default" href="index">To main</a>
                    <a class="btn btn-default" href="cartclient?id=${idclient}">Back</a>
                </div>
        </div>
    </div>

<%@include file="../jspf/footer.jspf" %>
