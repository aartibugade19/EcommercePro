<%-- 
    Document   : HomePage
    Created on : Sep 26, 2015, 2:09:24 PM
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
        <h1>Welcome For SHOPPING!!!!!!!!!</h1>
        <%
        if(session.getAttribute("error")!=null)
            {
            out.println("wrong user name password");
            }
        %>
        <form action="/LoginServlet" method="post">
         
            UserName:<br>
            <input type="text" name="uname"/><br>
            Password:<br>
            <input type="password" name="password"/><br>
            <input type="submit" value="LOGIN">
           <a href="/SignUpServlet"><input type="submit" value="SIGN UP" ></a>
        </form>
     </body>
</html>
