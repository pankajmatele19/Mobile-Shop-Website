package Servletfiles;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class logout extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        HttpSession session = req.getSession();
        if (session != null) {
            session.invalidate();
            res.sendRedirect("home.html");
        } else {
            res.sendRedirect("login.html");
        }
    }
}
