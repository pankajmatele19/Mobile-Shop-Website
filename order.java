package Servletfiles;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class order extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop", "root", "");
            HttpSession session = req.getSession();
            String username = (String) session.getAttribute("User");
            int price = Integer.parseInt(req.getParameter("price"));
            String model = req.getParameter("model");
            String spec = req.getParameter("spec");

            String query = "insert into order1 (Username,Model,Spec,Price) values(?,?,?,?)";

            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, username);
            st.setString(2, model);
            st.setString(3, spec);
            st.setInt(4, price);

            st.executeUpdate();
            res.sendRedirect("showorder");
        } catch (Exception e) {
            out.println(e);
        }
    }
}
