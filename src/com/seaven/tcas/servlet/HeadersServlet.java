package com.seaven.tcas.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @author yurifeng
 * @create 2018-12-05 9:50
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletTest001
 */
@WebServlet(value = "/head")
public class HeadersServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        Enumeration e = req.getHeaderNames();       // gets all headers information

        out.println("<H4>Following are the Headers coming from the Client<BR></H4>");

        out.println("<table border=2 bordercolor=gray>");

        out.println("<tr><th>Header Name</th><th>Header Value</th></tr>");

        while (e.hasMoreElements()) {
            String name = (String) e.nextElement();
            String value = req.getHeader(name);       // gets each header information separately
            out.println("<tr><th>" + name + "</th><th>" + value + "</th></tr>");
        }
        out.println("</table>");
        out.close();
    }
}
