<div id="custom-bootstrap-menu" class="navbar navbar-default " role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-menubuilder"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse navbar-menubuilder">
            <ul class="nav navbar-nav navbar-left">
                <li><a href="index.jsp">Home</a>
                </li>
                <li><a href="dashboard.jsp">List All Records</a></li>
                <li><a href="add.jsp">Add a record</a></li>
                <li><a href="logout.jsp">Logout</a></li>

            </ul>
            <div class="col-sm-3 col-md-3 pull-right">
                <form class="navbar-form" role="search" action="adminSearch" method="post">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Search" name="searchVal" id="searchVal">
                        <div class="input-group-btn">
                            <button class="btn btn-default" type="submit" name="submit"><i class="glyphicon glyphicon-search"></i></button>
                        </div>
                    </div>
                </form>


            </div>
        </div>
    </div>
</div>