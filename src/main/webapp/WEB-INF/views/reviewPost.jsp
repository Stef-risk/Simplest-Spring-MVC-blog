
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Review what you just posted</title>
</head>
<body>
<h1>You just Posted : </h1>
    <h2>title :  ${title}</h2>
    <h2>Content :  ${body}</h2>
    <h2>Date :  ${date}</h2>

<br>
<a href="/spring-mvc/post" methods="GET">Go Back</a>
</body>
</html>
