
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Do your post on this page</title>
</head>
<body>

    <h1>Do your post on this page</h1>

    <form action="/spring-mvc/post" method="post">
        Post title : <input type="text" name="title">
        <br>
        Post Body : <input type="text" name="body">
        <input type="submit" value="post">
    </form>

</body>
</html>
