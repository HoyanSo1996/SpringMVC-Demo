<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>文件下载测试</title>
</head>
<body>
<h1>下载文件的测试 </h1>
<a href="../file/download">点击下载文件</a>
<br/><br/><hr/>

<h1>文件上传的测试</h1>
<form action="../file/upload" method="post" enctype="multipart/form-data">
文件介绍:<input type="text" name="introduction"><br>
选择文件:<input type="file" name="file"><br>
<input type="submit" value="上传文件">
</form>
</body>
</html>