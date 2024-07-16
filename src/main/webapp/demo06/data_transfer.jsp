<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>SpringMVC 数据格式化</title>
</head>
<body>
<h3>添加妖怪</h3>
<form action="<%=request.getContextPath()%>/monster/add" method="POST">
名字: <input type='text' name="name"/> <br><br>
年龄: <input type='text' name="age"/> <br><br>
生日: <input type='text' name="birthday"/> 要求以"9999-11-11"的形式<br><br>
工资: <input type='text' name="salary"/> 要求以"123,890.12"的形式<br><br>
邮件: <input type='text' name="email"/> <br><br>
<input type="submit" value="添加妖怪"/>
<form>
</body>
</html>