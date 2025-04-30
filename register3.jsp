<%@page contentType="text/html;charset=utf-8" %>
<jsp:useBean id="rb" scope="request" class="bean.RegisterBean" />

<html>
  <head>
    <title>Confirm Page by MVC</title>
  </head>
  <body>
    <h1>Confirm Page by MVC</h1>
    <p>Name: <jsp:getProperty name="rb" property="name" /></p>
    <p>Age: <%= rb.getJpAge() %></p>
    <p>Languages: <%= rb.getStrLangs() %></p>

    <button type="submit">Submit</button>
    <button type="reset">Reset</button>
  </body>
</html>