package Servletfiles;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class deleteorder extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
        res.setContentType("text/html");
        PrintWriter out= res.getWriter();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop","root","");
            HttpSession session = req.getSession();
            int ordid = Integer.parseInt(req.getParameter("Orderid"));
            String query = "delete from order1 where Orderid='"+ordid+"'";
            PreparedStatement ps=con.prepareStatement(query);
            ps.executeUpdate();
            res.sendRedirect("showorder");
        }
        catch (Exception e) {
            out.println(e);
        }
    }
}

