import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetColorServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

String color = request.getParameter("color");
response.setContentType("text/html");
PrintWriter pw = response.getWriter();
pw.println("<B>The selected color is: "+color);

pw.close();
}
}