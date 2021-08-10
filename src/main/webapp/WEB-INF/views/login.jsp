
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is Login Page</title>
</head>
<body>
    <h1>Hello loginer</h1>
    <p><span style="color: #663399; ">${invalidation}</span> </p>
<%--    在登陆失败后提示错误信息--%>
<form action="/spring-mvc/login" method="post" >
<%--    用于用户提交登录信息的表格--%>
    Enter your name : <input type="text" , name="name">
    <br>
    Enter your password : <input type="password" , name="password">
    <input type="submit" , value="Login">
</form>
</body>
</html>
