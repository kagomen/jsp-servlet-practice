<%-- pageディレクティブタグ --%>
<%@page contentType="text/html;charset=utf-8" %>
<%-- 宣言タグ --%>
<%!
  String fortune(){
    String f;
    double fn=Math.random();
    if(fn>=0.7){
      f="大吉";
    }else if(fn>=0.4){
      f="中吉";
    }else if(fn>=0.1){
      f="小吉";
    }else{
      f="凶";
    }
    return f;
  }
%>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>JSP Fortune</title>
</head>
<body>
  <h1>JSP Fortune</h1>
  <%-- スクリプトレット --%>
  <% for(int i=0;i<2;i++){ %>
  <%-- 式タグ --%>
  <p><%= fortune() %></p>
  <% } %>
</body>
</html>

