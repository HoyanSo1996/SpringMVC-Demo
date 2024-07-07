<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
  Created by IntelliJ IDEA.
  User: KennySo
  Date: 2024/7/8
--%>
<html>
<head>
    <title>获取 session 域数据</title>
</head>
<body>
<h1>获取数据显示页面</h1>
<hr>
<h3>取出 session 域的数据</h3>
主人序号: ${sessionScope.master.id} <br/>
主人名字: ${sessionScope.master.name} <br/>
宠物名字: ${sessionScope.master.pet.name} <br/>
全部信息: ${sessionScope.master} <br/>
地址: ${sessionScope.address}
</body>
</html>
