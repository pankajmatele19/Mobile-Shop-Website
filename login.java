package Servletfiles;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class login extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop", "root", "");
            String username = req.getParameter("username");
            String pass = req.getParameter("password");
            String query = "select * from customer where Username='" + username + "' and Password='" + pass + "'";
            Statement st = con.createStatement();
//            req.getRequestDispatcher("login.html").include(req, res);
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                HttpSession session = req.getSession();
                session.setAttribute("User", username);
                res.sendRedirect("userhome.jsp");
            } else {
                out.print("<script>alert('Wrong Details')</script>");
                RequestDispatcher rd = req.getRequestDispatcher("login.html");
                rd.include(req, res);
            }
            con.close();
        } catch (Exception e) {
            out.println(e);
        }

    }
}
