<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Customers"%>
<% Customers cust = (Customers) request.getAttribute("Customers");%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="includes/bootstrap.jsp"%>
        <title>Update a Visitor</title>
    </head>
    <body>
        <div class="container"> <!-- wrap -->

            <%@include file="includes/header.jsp" %> 

            <%@include file="includes/adminmenu.jsp" %> 

            <div class="container"> <!-- main -->   



                <div class="row">
                    <div class="col-md-offset-1 col-md-10">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <center><h2>Update a Record</h2></center>
                            </div>
                            <br>
                            <form class="form-horizontal" name="updateForm" action="updateCustomer" method="post"> 

                                <div class="form-group">

                                    <label for="id" class="col-sm-2 control-label">Customer ID:</label>
                                    <div class="col-sm-10">
                                        <textarea class="form-control" rows="1"type="text" name="id" id="id" readonly/><%= cust.getCustID()%></textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="firstName" class="col-sm-2 control-label">First Name:</label>
                                    <div class="col-sm-10">
                                        <textarea class="form-control" rows="1"type="text" name="firstName" id="firstName" required/><%= cust.getFirstName()%></textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="lastName" class="col-sm-2 control-label">Last Name:</label>
                                    <div class="col-sm-10">
                                        <textarea class="form-control" rows="1"type="text" name="lastName" id="lastName" required/><%= cust.getLastName()%></textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="addr1" class="col-sm-2 control-label">Address 1:</label>
                                    <div class="col-sm-10">
                                        <textarea class="form-control" rows="1"type="text" name="addr1" id="addr1" required/><%= cust.getAddr1()%></textarea>
                                    </div>
                                </div>
                                    
                                <div class="form-group">
                                    <label for="addr2" class="col-sm-2 control-label">Address 2:</label>
                                    <div class="col-sm-10">
                                        <textarea class="form-control" rows="1"type="text" name="addr2" id="addr2" required/><%= cust.getAddr2()%></textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="city" class="col-sm-2 control-label">City:</label>
                                    <div class="col-sm-10">

                                        <textarea class="form-control" rows="1"type="text" name="city" id="city" required/><%= cust.getCity() %></textarea>

                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="state" class="col-sm-2 control-label">State:</label>
                                    <div class="col-sm-10">

                                        <textarea class="form-control" rows="1"type="text" name="state" id="state" required/><%= cust.getState() %></textarea>

                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="zip" class="col-sm-2 control-label">ZIP Code:</label>
                                    <div class="col-sm-10">

                                        <textarea class="form-control" rows="1"type="text" name="zip" id="zip" required/><%= cust.getZip() %></textarea>

                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="email" class="col-sm-2 control-label">Email:</label>
                                    <div class="col-sm-10">

                                        <textarea class="form-control" rows="1"type="email" name="email" id="email" required/><%= cust.getEmailaddr() %></textarea>

                                    </div>
                                </div>

                                

                                <br>


                                
                                <div class="form-group">
                                    <div class="col-sm-offset-5 col-sm-12">
                                        <button type="submit" name="submit" value="Update" class="btn btn-primary">Update</button>

                                        <a href="dashboard.jsp" role="button" class="btn btn-danger">Cancel</a>
                                    </div>
                                </div>


                            </form>
                        </div>
                    </div>







                    <br>


                </div>  



            </div> <!-- close main -->


            <%@include file="includes/footer.jsp" %>

        </div> 
    </body>
</html>
