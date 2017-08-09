<%--
  Created by IntelliJ IDEA.
  User: denys
  Date: 09.08.17
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table class="td">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Price</th>
        </tr>
        <tr>
            <th>${book.id}</th>
            <th>${book.title}</th>
            <th>${book.author}</th>
            <th>${book.price}</th>
        </tr>
    </table>

</body>
</html>
