import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet{
public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
RequestDispatcher rd;
String name=request.getParameter("name");
String password=request.getParameter("password");
response.setContentType("text/html");
PrintWriter pw=response.getWriter();
if((name.equals("dhruv"))&&(password.equals("singh"))){
rd=request.getRequestDispatcher("web8");
rd.forward(request, response);
}
else{
pw.println("<b><h1>Incorrect username or password !!!</h1></b>");
rd=request.getRequestDispatcher("/login.html");
rd.include(request,response);
//response.sendRedirect("login.html");
}
}    
}
