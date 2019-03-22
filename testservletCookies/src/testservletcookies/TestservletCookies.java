/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testservletcookies;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.io.PrintWriter;
/**
 *
 * @author KPaul
 */
public class TestservletCookies  extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("cookie1","kamasu cookie");
        cookie.setMaxAge(3600);
        resp.addCookie(cookie);
      try{
            resp.setContentType("text/html");
PrintWriter out = resp.getWriter();
String title = "Setting Cookies";
out.println(
"<BODY BGCOLOR=\"#FDF5E6\">\n" +
"<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
"There are six cookies associated with this page.\n" +
"To see them, visit the\n" +
"<A HREF=\"/servlet/coreservlets.ShowCookies\">\n" +
"<CODE>ShowCookies</CODE> servlet</A>.\n" +
"<P>\n" +
"Three of the cookies are associated only with the\n" +
"current session, while three are persistent.\n" +
"Quit the browser, restart, and return to the\n" +
"<CODE>ShowCookies</CODE> servlet to verify that\n" +
"the three long-lived ones persist across sessions.\n" +
"</BODY></HTML>");
      }catch(IOException e){
          System.out.print(e.getCause());
      }
        
    }
   

    
}
