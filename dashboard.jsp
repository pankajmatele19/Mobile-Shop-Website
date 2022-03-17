<%-- 
    Document   : dashboard
    Created on : 21 Jan, 2022, 3:26:34 PM
    Author     : Pankaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<html>
    <head>
        <link rel="stylesheet" href="dashboard.css">
        <title>Dashboard</title></head>
    <body>
        <header class="myNav">
            <div class="left_container">
                <h3>welcome ${User}</h3>
            </div>

            <div class="right_container">
                <button><a href="logout" style="text-decoration: none;">Logout</a></button>
            </div>
        </header>
        <div class="left_nav">
            <ul>
                <li class="left_nav_items"><a href="userhome.jsp">Home</a> </li>
                <li class="left_nav_items"><a href="showorder">Orders</a> </li>
                <li class="left_nav_items"><a href="updateprofile.html">Update Profile</a> </li>
                <!-- <li class="left_nav_items"><a href="#">Sell House</a> </li>
                <li class="left_nav_items"><a href="#">Rent House</a> </li> -->
            </ul>
        </div>
        <main>
            
            <h2>Profile Details</h2>
            <% try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop", "root", "");
            String username = (String) session.getAttribute("User");
            Statement st = con.createStatement();
            String query = "select * from customer where Username='" + username + "'";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                out.println("<h3>Name : "+rs.getString("Name")+"</h3>");
                out.println("<h3>Username : "+rs.getString("Username")+"</h3>");
                out.println("<h3>Password : "+rs.getString("Password")+"</h3>");
                out.println("<h3>Email : "+rs.getString("Email")+"</h3>");
                out.println("<h3>Phone : "+rs.getString("Phone")+"</h3>");
                out.println("<h3>Address : "+rs.getString("Address")+"</h3>");
                }
            } catch (Exception e) {
            out.print(e);
        } %>
        </main>
    </body>
</html>
