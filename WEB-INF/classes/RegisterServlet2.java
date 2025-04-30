import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register2")
public class RegisterServlet2 extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    req.setCharacterEncoding("utf-8");

    // データ整形
    String resLangs = "";
    String[] reqLangs = req.getParameterValues("lang");
    for (int i = 0; i < reqLangs.length; i++) {
      resLangs = resLangs + reqLangs[i] + " ";
    }
    req.setAttribute("langs", resLangs);

    // ディスパッチャーの作成
    RequestDispatcher rd = req.getRequestDispatcher("/register2.jsp");
    rd.forward(req, res);
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    doPost(req, res);
  }
}
