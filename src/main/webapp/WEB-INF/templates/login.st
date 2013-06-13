<!DOCTYPE html>
<html>
<head>
    <title>Some Web App</title>
    <link type="text/css" href="/css/bootstrap.css" rel="stylesheet">
    <link type="text/css" href="/css/login.css" rel="stylesheet">
    <link type="text/css" href="/css/bootstrap-responsive.css" rel="stylesheet">
</head>
<body>
    <div class="container">

        <form class="form-signin" action="/j_spring_security_check" method="POST">
            <h2 class="form-signin-heading">Please sign in</h2>
            <input name="j_username" type="text" class="input-block-level" placeholder="Username">
            <input name="j_password" type="password" class="input-block-level" placeholder="Password">
            <label class="checkbox">
                <input type="checkbox" value="remember-me"> Remember me
            </label>
            <input name="submit" class="btn btn-large btn-primary" type="submit" value="Sign In"/>
        </form>
    </div>
</body>
</html>