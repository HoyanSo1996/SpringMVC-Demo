<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>SpringMVC 数据验证</title>
</head>
<body>
<h3>添加妖怪</h3>
<form action="<%=request.getContextPath()%>/monster/add2" method="POST">
名字: <input type='text' name="name"/> ${requestScope.monster_name}<br><br>
年龄: <input type='text' name="age"/> ${requestScope.monster_age}<br><br>
生日: <input type='text' name="birthday"/> ${requestScope.monster_birthday}<br><br>
工资: <input type='text' name="salary"/> ${requestScope.monster_salary}<br><br>
邮件: <input type='text' name="email"/> ${requestScope.monster_email}<br><br>
<input type="submit" value="添加妖怪"/>
<form>
</body>
</html>