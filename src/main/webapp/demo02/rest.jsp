<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
  Created by IntelliJ IDEA.
  User: KennySo
  Date: 2024/7/2
--%>
<html>
<head>
    <title>Restful API Test</title>
    <script type="text/javascript" src="../script/jquery-3.6.0.min.js"></script>
    <script type="text/javascript">
    $(function () {
        $("#deleteBook").click(function () {
            var href = this.href;
            $("#hiddenForm").attr("action", href);
            $("#hiddenForm").submit(); // 提交删除请求
            return false;  // 这里必须返回 false, 否则会提交两次
        });
    })
    </script>
</head>

<body>
<h3>Rest 风格的 crud 操作案例</h3>
<hr>

<h3>rest 风格的 url 查询书籍[get]</h3>
<a href="../books/100">点击查询书籍</a>
<hr>

<h3>rest 风格的 url 添加书籍[post]</h3>
<form action="../books" method="post">
    name: <input name="bookName" type="text"><br>
    <input type="hidden" name="id" value="200"><br>
    <input type="submit" value="添加书籍">
</form>
<hr>

<h3>rest 风格的 url 删除一本书[delete]</h3>
<!--
    name = "_method" 名字需要写成 _method 因为后台的 HiddenHttpMethodFilter
    就是按这个名字来获取 hidden 域的值，从而进行请求转换的.
-->
<a href="../books/300" id="deleteBook">删除指定 id 的书</a>
<form action="" method="post" id="hiddenForm">
    <input type="hidden" name="_method" value="DELETE"/>
</form>
<hr>

<h3>rest 风格的 url 修改书籍[put]</h3>
<form action="../books" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="hidden" name="id" value="400"><br>
    <input type="submit" value="修改书籍~">
</form>
</body>
</html>
