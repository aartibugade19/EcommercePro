<%-- 
    Document   : ProductPage
    Created on : Oct 18, 2015, 11:29:58 AM
    Author     : Aarti
--%>

<%@page import="java.util.Iterator"%>
<%@page import="ecommerceproject.entity.product"%>
<%@page import="java.util.List"%>
<%@page import="ecommerceproject.manager.ProductManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Products are:</h1>

        <%
           ProductManager obj=new ProductManager();
           List<product> p=obj.getlistProduct();
           out.println("total products "+p.size());
           out.println("<br>");
           Iterator<product>itr=p.iterator();
           while(itr.hasNext())
               {
               product p1= itr.next();
               out.println("<br>"+p1.getProduct_name()+"<br>");
               }

        %>
    </body>
</html>
