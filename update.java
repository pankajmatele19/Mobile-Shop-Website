package Servletfiles;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class update extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop", "root", "");
            HttpSession session= req.getSession();
            String username = (String) session.getAttribute("User");
            String email = req.getParameter("email");
            String Phone = req.getParameter("phone");
            String Address = req.getParameter("address");
            String query = "update customer set email=?, phone=?,address=? where username=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, email);
            ps.setString(2, Phone);
            ps.setString(3, Address);
            ps.setString(4, username);
            ps.executeUpdate();
            out.println("<script>alert('Profile Updated')</script>");
            res.sendRedirect("dashboard.jsp");
            con.close();
        } catch (Exception e) {
            out.println(e);
        }

    }
}
