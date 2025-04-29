import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

    // リクエストをUTF-8で読み取るという指定
    req.setCharacterEncoding("utf-8");

    // レスポンスの形式を指定
    res.setContentType("text/html;charset=utf-8");

    PrintWriter out = res.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("<title>Confirm Page</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Confirm Page</h1>");
    out.println("<p>Name: " + req.getParameter("name") + "</p>");
    out.println("<p>Password: " + req.getParameter("password") + "</p>");
    out.println("</body>");
    out.println("</head>");
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    doPost(req, res);
  }
}
