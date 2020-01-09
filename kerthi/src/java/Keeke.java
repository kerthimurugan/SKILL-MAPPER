
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Keeke extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("kerthi");
        String password=request.getParameter("12345");  
    if (password.equals ("admin123")  )
    {
    out.println("successfully logged in");
    out.println("<br>welcome,"+name);
    Cookie ck=new Cookie("name",name);
            response.addCookie(ck);
     }
    else{
    out.println("username or password is incorrect");
    }
    out.close();
    }
    
    
    }

