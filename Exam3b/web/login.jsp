
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>

        <%@include file="includes/bootstrap.jsp"%>

        <title>Administrator login</title>
    </head>
    <body>
        <div class="container"> <!-- wrap -->



            <%@include file="includes/header.jsp"%>


            <%@include file="includes/menu.jsp" %> 


            <div class="row"> 
                
                <div class="col-md-6 col-md-offset-3">
                    <form role="search" action="dashboard.jsp" method="post">
                        <div class="input-group-group">
                            <label for="userName">User Name</label>
                            <input type="text" class="form-control" id="userName" name="userName" placeholder="User Name">
                        
                            <br>
                            <label for="passWord">Password</label>
                            <input type="password" class="form-control" id="passWord"  name="passWord" placeholder="Password">
                        
                        
                            <br>
                        <center><button type="submit" class="btn btn-default">Submit</button></center>
                        </div>
                    </form>
                </div>
               
            </div>
            <br>



            <%@include file="includes/footer.jsp" %>

        </div> <!-- close wrap -->
    </body>

</html>
