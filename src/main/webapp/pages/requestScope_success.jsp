<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
  Created by IntelliJ IDEA.
  User: KennySo
  Date: 2024/7/6
--%>
<html>
<head>
    <title>获取 request 域数据</title>
</head>
<body>
<h1>获取数据显示页面</h1>
<hr>
<h3>取出 request 域的数据</h3>
主人序号: ${requestScope.master.id} <br/>
主人名字: ${requestScope.master.name} <br/>
宠物名字: ${requestScope.master.pet.name} <br/>
全部信息: ${requestScope.master} <br/>
地址: ${requestScope.address}
</body>
</html>
