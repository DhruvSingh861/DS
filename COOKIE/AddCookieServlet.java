import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class AddCookieServlet extends HttpServlet{
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
String data=request.getParameter("data");
Cookie cookie=new Cookie("DHRUV_KA_COOKIE_hai",data);
cookie.setMaxAge(60);
response.addCookie(cookie);
response.setContentType("text/html");
PrintWriter pw=response.getWriter();
pw.println("MY COOKIE HAS BEEN SEND TO: "+data);
pw.close();
}
} 