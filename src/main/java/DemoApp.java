import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class DemoApp extends HttpServlet {
   public List<String> customer = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        customer.add("ronaldo");
        customer.add("kaka");
        customer.add("ronaldinho");

        PrintWriter writer=resp.getWriter();
        writer.println("<table style='border: 1px solid black'>");
        for (int i=0;i<customer.size();i++){
            writer.println("<tr><td style='border: 1px solid black'><a href='/customer?"+customer.get(i)+"="+customer.get(i)+"' name='"+ customer.get(i)+"' value='"+ customer.get(i)+"'>" + customer.get(i)+ "</a></td></tr>");
        }
        writer.println("</table>");
        resp.setContentType("text/html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
