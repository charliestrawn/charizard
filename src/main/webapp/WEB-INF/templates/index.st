<!DOCTYPE html>
<html>
    <head>
        <title>Some Web App</title>
        <link type="text/css" href="/resources/css/bootstrap.css" rel="stylesheet">
        <link type="text/css" href="/resources/css/login.css" rel="stylesheet">
        <link type="text/css" href="/resources/css/bootstrap-responsive.css" rel="stylesheet">
    </head>
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <a class="brand" href="#">Payment Tracker</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                            <li class="active"><a href="#">Home</a></li>
                            <li><a href="#">Members</a></li>
                            <li><a href="#">Reports</a></li>
                            <li><a href="#">About</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span3">
                    <div class="sidebar-nav">
                        <form action="/payments" method="POST">
                            <fieldset>
                                <legend>Add Payment</legend>
                                <label>Date</label>
                                <input name="date" type="text" placeholder="Date">
                                <label>Name</label>
                                <input name="name" type="text" placeholder="Name">
                                <label>Check Number</label>
                                <input name="checkNumber" type="text" placeholder="Check Number">
                                <label>Amount</label>
                                <input name="amount" type="number" placeholder="Amount">
                                <button type="submit" class="btn btn-block">Submit</button>
                            </fieldset>
                        </form>
                    </div>
                </div>
                <div class="span9">
                    <table class="table table-hover">
                        <thead>
                            <th>Date</th>
                            <th>Name</th>
                            <th>Check #</th>
                            <th>Amount</th>
                        </thead>
                        <tbody id="payment-table">
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <script src="/resources/js/lib/jquery.js"></script>
        <script src="/resources/js/lib/underscore.js"></script>
        <script src="/resources/js/lib/backbone.js"></script>
        <script src="/resources/js/app.js"></script>
    </body>
</html>