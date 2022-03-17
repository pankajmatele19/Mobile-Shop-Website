<%-- 
    Document   : orders
    Created on : 20 Jan, 2022, 9:41:36 PM
    Author     : Pankaj
--%>

<%@page import="java.sql.*;"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop", "root", "");
            String user = (String) request.getAttribute("User");
            Statement st = con.createStatement();
            String query = "select * from order1 where Username='" + user + "'";
            out.println("<center>");
            out.println("<h3>Student Data From DataBase</h3>");
            out.println("<br><table border=1 width=50% height=50% style= text-align:center>");
            out.println("<tr><th>Username</th><th>Model</th><th>Specs</th><th>Price</th></tr>");
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString("Username");
                String model = rs.getString("Model");
                String contact = rs.getString("contact");
                int price = rs.getInt("Price");
                out.println("<tr><td>" + name + "</td><td>" + model + "</td><td>" + contact + "</td><td>" + price + "</td><tr>");

            }
            out.println("</table>");
            out.println("</center>");
            out.println("</body></html>");
        } catch (Exception e) {
            out.print(e);
        }
    }
}
%>
