import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Customers extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        if ("ronaldo".equals(req.getParameter("ronaldo"))){
            writer.println("Name: Ronaldo");
            writer.println("Age: 34");
            writer.println("From: Portugal");
        }
        if ("kaka".equals(req.getParameter("kaka"))){
            writer.println("Name: Kaka");
            writer.println("Age: 33");
            writer.println("From: Brazil");
        }
        if ("ronaldinho".equals(req.getParameter("ronaldinho"))){
            writer.println("Name: Ronaldinho");
            writer.println("Age: 35");
            writer.println("From: Brazil");
        }
    }
}
