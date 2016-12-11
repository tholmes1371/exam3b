
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>

        <%@include file="includes/bootstrap.jsp"%>

        <title>Exam 3 (Holmes)</title>
    </head>
    <body>
        <div class="container"> <!-- wrap -->



            <%@include file="includes/header.jsp"%>


            <%@include file="includes/menu.jsp" %> 


            <div class="row">
                <div class="col-xs-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <center><h2>Full Contact List</h2></center>
                        </div>
                        <table class="table table-bordered table-fixed table-hover">

                            
                            <% String full = (String) request.getAttribute("table");%>
                            <%= full%>  
                        </table>
                    </div>
                </div>


            <br>
            <br>

            <%@include file="includes/footer.jsp" %>

        </div> <!-- close wrap -->

    </body>

</html>
