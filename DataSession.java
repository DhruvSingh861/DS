import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class DataSession extends HttpServlet{
public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
HttpSession s=request.getSession();
response.setContentType("text/http");
PrintWriter pw=response.getWriter();
Date date=(Date) s.getAttribute("date");
if(date!=null){pw.println("Last access: " + date);}
date=new Date();
s.setAttribute("date", date);
pw.println("Current date: " + date );
}
}
