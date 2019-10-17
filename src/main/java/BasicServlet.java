import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/BasicServlet")
public class BasicServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String petName = request.getParameter("petName");
        String petAge = request.getParameter("petAge");
        String petType = request.getParameter("petType");
        PrintWriter writer = response.getWriter();
        writer.println("We've got you pet name is: " + petName);
    }
}
