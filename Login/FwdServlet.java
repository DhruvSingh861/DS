import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class FwdServlet extends HttpServlet{
public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
String name=request.getParameter("name");
response.setContentType("text/html");
PrintWriter pw=response.getWriter();
pw.println("<h1>Welcome "+name+" sir</h1>");
}
}