<%-- 
    Document   : index
    Created on : Aug 22, 2015, 5:40:29 PM
    Author     : Aarti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sign Up </h1>
        <form action="signupservlet" method="post">
            First Name:<br>
            <input type="text" name="fname"/><br>
            Surname:<br>
            <input type="text" name="lname"/><br>
            Email ID:<br>
            <input type="email" name="mail"/><br><br>
            <select>
                <option value="gender">Gender</option>
                <option value="female">Female</option>
                <option value="male">Male</option>
            </select><br><br>
            Birthday:<br>
            <input type="date" name="bday"/><br>
            Password:<br>
            <input type="password" name="password"><br>
            <input type="submit" value="submit"/><br>
           <a href="login.jsp">"Already have an account?Log in"</a>
  
            </form>
    </body>
</html>
