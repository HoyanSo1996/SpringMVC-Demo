<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>异常信息</title>
</head>
<body>
<h1>测试异常</h1>
<a href="<%=request.getContextPath()%>/exception01?num=0">测试局部异常</a><br><br>

<a href="<%=request.getContextPath()%>/exception02">测试全局异常</a><br><br>

<a href="<%=request.getContextPath()%>/exception03">测试统一异常处理[SimpleMappingExceptionResolver]</a><br><br>

<a href="<%=request.getContextPath()%>/exception04?age=130">测试自定义异常类</a><br><br>

<a href="<%=request.getContextPath()%>/exception05?age=132">测试自定义异常类2</a><br><br>
</body>
</html>