import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

    // セッションオブジェクトの生成
    HttpSession session = req.getSession(true);

    ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");

    // 初回
    if (cart == null) {
      cart = new ArrayList<>();
    } else {
      // 2回目以降
      req.setCharacterEncoding("utf-8");
      String book = req.getParameter("book");
      cart.add(book);
    }

    session.setAttribute("cart", cart);

    // 画面表示処理
    res.setContentType("text/html;charset=utf-8");
    PrintWriter out = res.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("<title>Cart Page</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Book Page</h1>");
    out.println("<form action=\"/javapractice/session\" method=\"post\">");
    out.println("<select name=\"book\" id=\"book\">");
    out.println("<option value=\"book A\">book A</option>");
    out.println("<option value=\"book B\">book B</option>");
    out.println("<option value=\"book C\">book C</option>");
    out.println("</select>");
    out.println("<button type=\"submit\">Submit</button>");
    out.println("</form>");

    out.println("<h2>Contents of cart</h2>");
    for (int i = 0; i < cart.size(); i++) {
      out.println("<p>" + cart.get(i) + "</p>");
    }

    out.println("</body>");
    out.println("</html>");
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    doPost(req, res);
  }
}
