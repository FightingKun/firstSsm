<%--
  Created by IntelliJ IDEA.
  User: chenkun
  Date: 2019/2/21
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/employee/add" method="post">
        <p>realName:<input type="text" name="realName"></p>
        <p>mobile:<input type="text" name="mobile"></p>
        <p>email:<input type="text" name="email"></p>
        <p>position:<input type="text" name="position"></p>
        <p>note:<input type="text" name="note"></p>
        <p>sex:<input type="text" name="sex"></p>
        <p>birthday:<input type="date" name="birthday"></p>
        <input type="submit" value="提交"/>
    </form>

</body>
</html>
