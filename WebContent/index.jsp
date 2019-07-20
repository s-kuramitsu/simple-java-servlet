<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
       StringBuilder sb = new StringBuilder();
       sb.append("Hello");
       sb.append(" ");
       sb.append("World");
       out.print(sb.toString());
    %>
</body>
</html>
