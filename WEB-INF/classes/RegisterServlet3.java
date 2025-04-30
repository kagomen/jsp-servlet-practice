import bean.RegisterBean3;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register3")
public class RegisterServlet3 extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    req.setCharacterEncoding("utf-8");

    // 入力情報の取得
    String name = req.getParameter("name");
    String age = req.getParameter("age");
    String[] langs = req.getParameterValues("lang");

    // Beanの作成
    RegisterBean3 rb = new RegisterBean3();
    rb.setName(name);
    rb.setAge(age);
    rb.setLangs(langs);

    // Beanをリクエストに格納
    req.setAttribute("rb", rb);

    // JSPにフォワード
    RequestDispatcher rd = req.getRequestDispatcher("/register3.jsp");
    rd.forward(req, res);
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    doPost(req, res);
  }
}
