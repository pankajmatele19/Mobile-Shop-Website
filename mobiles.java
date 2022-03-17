package Servletfiles;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class mobiles extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop", "root", "");

            Statement st = con.createStatement();
            String query = "select * from Mobiles";


out.println("<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <title>Document</title>\n" +
"    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
"    <link rel=\"stylesheet\" href=\"shop.css\">\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <header>\n" +
"        <div class=\"links\">\n" +
"            <ul>\n" +
"                <li>\n" +
"                    <h3>PEXELS</h3>\n" +
"                </li>\n" +
"                <li><a href=\"home.html\">HOME</a></li>\n" +
"                <li><a href=\"#\">SHOP</a></li>\n" +
"                <li><a href=\"#\">CONTACT US</a></li>\n" +
"            </ul>\n" +
"        </div>\n" +
"        <div class=\"cred\">\n" +
"            <button href=\"register.html\">REGISTER</button>\n" +
"            <button href=\"login.html\">LOGIN</button>\n" +
"        </div>\n" +
"    </header>\n" +
"    <div class=\"container\">\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/iphone11.jpg\" title=\"Samsung S20\">\n" +
"            <div class=\"content\">\n" +
"                <h3>Apple Iphone 11</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Order</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/iphone11tale.jpg\" title=\"Samsung S20\"><br>\n" +
"            <div class=\"content\">\n" +
"                <h3>Apple Iphone 13</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Order</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/s21.jpg\" title=\"Samsung S20\"><br>\n" +
"            <div class=\"content\">\n" +
"                <h3>Samsung S21</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Order</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/note20.jpg\" title=\"Samsung S20\"><br>\n" +
"            <div class=\"content\">\n" +
"                <h3>Samsung Note 20</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Order</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <div class=\"container\">\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/iphone11.jpg\" title=\"Samsung S20\">\n" +
"            <div class=\"content\">\n" +
"                <h3>Apple Iphone 11</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Add to cart</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/iphone11tale.jpg\" title=\"Samsung S20\"><br>\n" +
"            <div class=\"content\">\n" +
"                <h3>Apple Iphone 13</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Add to cart</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/s21.jpg\" title=\"Samsung S20\"><br>\n" +
"            <div class=\"content\">\n" +
"                <h3>Samsung S21</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Add to cart</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/note20.jpg\" title=\"Samsung S20\"><br>\n" +
"            <div class=\"content\">\n" +
"                <h3>Samsung Note 20</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Add to cart</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <div class=\"container\">\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/iphone11.jpg\" title=\"Samsung S20\">\n" +
"            <div class=\"content\">\n" +
"                <h3>Apple Iphone 11</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Add to cart</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/iphone11tale.jpg\" title=\"Samsung S20\"><br>\n" +
"            <div class=\"content\">\n" +
"                <h3>Apple Iphone 13</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Add to cart</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/s21.jpg\" title=\"Samsung S20\"><br>\n" +
"            <div class=\"content\">\n" +
"                <h3>Samsung S21</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Add to cart</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/note20.jpg\" title=\"Samsung S20\"><br>\n" +
"            <div class=\"content\">\n" +
"                <h3>Samsung Note 20</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Add to cart</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    <div class=\"container\">\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/iphone11.jpg\" title=\"Samsung S20\">\n" +
"            <div class=\"content\">\n" +
"                <h3>Apple Iphone 11</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Add to cart</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/iphone11tale.jpg\" title=\"Samsung S20\"><br>\n" +
"            <div class=\"content\">\n" +
"                <h3>Apple Iphone 13</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Add to cart</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/s21.jpg\" title=\"Samsung S20\"><br>\n" +
"            <div class=\"content\">\n" +
"                <h3>Samsung S21</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Add to cart</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"row\">\n" +
"            <img src=\"img/note20.jpg\" title=\"Samsung S20\"><br>\n" +
"            <div class=\"content\">\n" +
"                <h3>Samsung Note 20</h3><br>\n" +
"                <p>12GB Ram 128GB Memory</p><br>\n" +
"                <button><a href=\"cart.html\" style=\"text-decoration: none\">Add to cart</a></button>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"    </div>\n" +
"    <footer>\n" +
"        <h2>PEXELS</h2>\n" +
"        <h3>Created By Mr.Pankaj Kisan Matele</h3>\n" +
"\n" +
"    </footer>\n" +
"</body>");
            
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int rollno = rs.getInt("rollno");
                String name = rs.getString("name");
                String Class = rs.getString("class");
                Date dob = rs.getDate("dob");
                String contact = rs.getString("contact");
                String Address = rs.getString("address");
                out.println("<tr><td>" + rollno + "</td><td>" + name + "</td><td>" + Class + "</td><td>" + dob + "</td><td>" + contact + "</td><td>" + Address + "</td><tr>");

            }
            out.println("</table>");
            out.println("</center>");
            out.println("</body></html>");
        } catch (Exception e) {
            out.print(e);
        }

    }
}
