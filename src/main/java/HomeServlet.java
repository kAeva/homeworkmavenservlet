import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeServlet", urlPatterns = {"/"})
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.sendRedirect("/HomePage.html");
        PrintWriter writer = response.getWriter();
        writer.println("<html lang=\"en\">");
        writer.println("<head> <title>Title</title></head>");
        writer.println("<body>");
        writer.println("<form action=\"BasicServlet\" method = \"GET\">\n");
        writer.println("Name of the new pet: <input type = \"text\" name =\n" +
                "                \"petName\">");
        writer.println("Age of the new pet: <input type = \"text\" name =\n" +
                "                \"petAge\" />");
        writer.println("Type of the new pet: <input type = \"text\" name =\n" +
                "                \"petType\" />");
        writer.println(" <input type = \"submit\" value = \"Submit\" />");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");

    }
}
