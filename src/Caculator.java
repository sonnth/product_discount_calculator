import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Caculator", urlPatterns = "/display_discount")
public class Caculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        double discount_percent = Double.parseDouble(request.getParameter("discount_percent"));

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description: </h1>" + description);
        writer.println("<h1>Price: </h1>" + "$" + price);
        writer.println("<h1>Discount Percent: </h1>" + discount_percent + "%");
        writer.println("<h1>Price:Discount Amount: </h1>" + "$" + price * discount_percent * 0.1);
        writer.println("<h1>Discount Price: </h1>" + "$" + (price - price * discount_percent * 0.1));
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
