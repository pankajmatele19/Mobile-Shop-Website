package Servletfiles;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class showorder extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop", "root", "");
            HttpSession session = req.getSession();
            String username = (String) session.getAttribute("User");
            Statement st = con.createStatement();
            String query = "select * from order1 where Username='" + username + "'";
            out.println("<head>\n"
                    + "        <link rel=\"stylesheet\" href=\"dashboard.css\">\n"
                    + "        <title>Dashboard</title></head>\n"
                    + "    <body>\n"
                    + "        <header class=\"myNav\">\n"
                    + "            <div class=\"left_container\">\n"
                    + "                <h3>PEXELS</h3>\n"
                    + "            </div>\n"
                    + "\n"
                    + "            <div class=\"right_container\">\n"
                    + "                <button><a href=\"logout\" style=\"text-decoration: none\">Logout</a></button>\n"
                    + "            </div>\n"
                    + "        </header>\n"
                    + "        <div class=\"left_nav\">\n"
                    + "            <ul>\n"
                    + "                <li class=\"left_nav_items\"><a href=\"userhome.jsp\">Home</a> </li>\n"
                    + "                <li class=\"left_nav_items\"><a href=\"showorder\">Orders</a> </li>\n"
                    + "                <li class=\"left_nav_items\"><a href=\"updateprofile.html\">Update Profile</a> </li>\n"
                    + "            </ul>\n"
                    + "        </div>");
            out.println("<center>");
            out.println("<br><table border=1 width=50% height=80px style= text-align:center>");
            out.println("<tr><th>Orderid</th><th>Username</th><th>Model</th><th>Specs</th><th>Price</th><th>Remove</th></tr>");
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int oid = rs.getInt("Orderid");
                String name = rs.getString("Username");
                String model = rs.getString("Model");
                String spec = rs.getString("Spec");
                int price = rs.getInt("Price");
                HttpSession s1=req.getSession();
                s1.setAttribute("Model", model);
                out.println("<tr><td>" + oid + "</td><td>" + name + "</td><td>" + model + "</td><td>" + spec + "</td><td>" + price + "</td><td>" + "<a href='deleteorder?Orderid=" + oid + "'>Delete</a>" + "</td><tr>");

            }
            out.println("</table>");
            out.println("</center>");
        } catch (Exception e) {
            out.print(e);
        }
    }
}
