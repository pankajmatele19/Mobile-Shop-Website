package Servletfiles;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class register extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop", "root", "");
            String name = req.getParameter("name");
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            String email = req.getParameter("email");
            String Phone = req.getParameter("phone");
            String Address = req.getParameter("address");
            HttpSession session = req.getSession();
            session.setAttribute("email",email);
            session.setAttribute("phone",Phone);
            session.setAttribute("address",Address);
            String query = "insert into customer values(?,?,?,?,?,?)";

            PreparedStatement st = con.prepareStatement(query);

            st.setString(1, name);
            st.setString(2, username);
            st.setString(3, password);
            st.setString(4, email);
            st.setString(5, Phone);
            st.setString(6, Address);
            session.setAttribute("name", name);
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            session.setAttribute("email", email);
            session.setAttribute("phone", Phone);
            session.setAttribute("address", Address);
            st.executeUpdate();
            res.sendRedirect("login.html");
            con.close();
        } catch (Exception e) {
            out.println(e);
        }
    }
}
