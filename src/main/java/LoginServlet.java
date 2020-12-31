import sun.misc.Request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "LoginServlet", urlPatterns = "/login", initParams = {
        @WebInitParam(name = "username",value = "admin"),
        @WebInitParam(name= "password" ,value =  "admin")})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        String username=req.getParameter("username");
        String password=req.getParameter("password");

        String defaultUser =getServletConfig().getInitParameter("username");
        String defaultPass =getServletConfig().getInitParameter("password");

        PrintWriter writer= resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Servlet UserLogin</title>");
        writer.println("</head>");
        if (username.equals(defaultUser) && password.equals(defaultPass)){
            req.setAttribute("loginTime",new Date());
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req,resp);
        }else {
            resp.sendRedirect("login.jsp");
        }
        writer.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
