<%@page contentType="text/html;charset=utf-8" %>
<jsp:useBean id="counter" scope="session" class="bean.CounterBean" />
<html>
<head>
  <title>JSP Action Tag</title>
</head>
<body>
  <h1>JavaBeans Counter</h1>
  <p><jsp:getProperty name="counter" property="count" /></p>
</body>
</html>