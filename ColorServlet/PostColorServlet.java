import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class PostColorServlet extends HttpServlet{
public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
string col=request.getParameter("color");
response.setContentType("text/http");
PrintWriter pw=response.getWriter();
pw.println("YOUR SELECTED COLOR IS: "+col);
pw.close();
}
} 