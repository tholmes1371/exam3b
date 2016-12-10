


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>

        <%@include file="includes/bootstrap.jsp"%>




        <title>Exam3b</title>
    </head>
    <body>
        <div class="container"> <!-- wrap -->



            <%@include file="includes/header.jsp"%>


            <%@include file="includes/adminmenu.jsp" %> 

            <div class="container"> <!-- main -->

                <div class="row">
                    <div class="col-md-offset-1 col-md-10">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <center><h2>Add A Customer</h2></center>
                            </div>
                            <br>
                            <form class="form-horizontal" name="addform" action="add" method="post"> 

                                
                                <div class="form-group">
                                    <label for="firstName" class="col-sm-2 control-label">First Name:</label>
                                    <div class="col-sm-10">
                                        <textarea class="form-control" rows="1"type="text" name="firstName" id="firstName" required/></textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="lastName" class="col-sm-2 control-label">Last Name:</label>
                                    <div class="col-sm-10">
                                        <textarea class="form-control" rows="1"type="text" name="lastName" id="lastName" required/></textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="addr1" class="col-sm-2 control-label">Address 1:</label>
                                    <div class="col-sm-10">
                                        <textarea class="form-control" rows="1"type="text" name="addr1" id="addr1" required/></textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="addr2" class="col-sm-2 control-label">Address 2:</label>
                                    <div class="col-sm-10">
                                        <textarea class="form-control" rows="1"type="text" name="addr2" id="addr2" required/></textarea>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="city" class="col-sm-2 control-label">City:</label>
                                    <div class="col-sm-10">

                                        <textarea class="form-control" rows="1"type="text" name="city" id="city" required/></textarea>

                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="state" class="col-sm-2 control-label">State:</label>
                                    <div class="col-sm-10">

                                        <textarea class="form-control" rows="1"type="text" name="state" id="state" required/></textarea>

                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="zip" class="col-sm-2 control-label">ZIP Code:</label>
                                    <div class="col-sm-10">

                                        <textarea class="form-control" rows="1"type="text" name="zip" id="zip" required/></textarea>

                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="email" class="col-sm-2 control-label">Email:</label>
                                    <div class="col-sm-10">

                                        <textarea class="form-control" rows="1"type="email" name="email" id="email" required/></textarea>

                                    </div>
                                </div>



                                <br>



                                <div class="form-group">
                                    <div class="col-sm-offset-5 col-sm-12">
                                        <button type="submit" name="submit" value="Add" class="btn btn-primary">Add</button>

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
