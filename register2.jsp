<%@page contentType="text/html;charset=utf-8" %>
<% request.setCharacterEncoding("utf-8"); %>

<!DOCTYPE html>
<html lang="ja">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Confirm Page by JSP</title>
  </head>
  <body>
    <h1>Confirm Page by JSP</h1>
    <div>
      <p>Name: <%= request.getParameter("name") %></p>
    </div>
    <div>
      <p for="password">Password: <%= request.getParameter("password") %></p>
    </div>
    <div>
      <p for="gender">Gender: <%= request.getParameter("gender") %></p>
    </div>
    <div>
      <p for="lang">Language: <%= request.getAttribute("langs") %></p>
    </div>
    <div>
      <p for="address">Address: <%= request.getParameter("address") %></p>
    </div>
    <div>
      <p for="message">Message: <%= request.getParameter("message") %></p>
    </div>
    <button type="submit">Submit</button>
    <button type="reset">Reset</button>
  </body>
</html>