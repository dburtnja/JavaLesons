<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First</title>
    <style type="text/css">
        #b {
            transition: 400ms;
            border-radius: 50%;
            margin: auto;
        }
    </style>
</head>
<body>
<h3>Denys presents</h3>
<br/>
<a href="<c:url value="/books"/>" target="_blank">Books list</a>
<br/>
    <div id="b" onclick="change_size();" onmouseout="shrinc();"></div>
</body>
<script type="text/javascript">
    var div = document.getElementById("b");
    div.style.width = "200px";
    div.style.height = "200px";
    div.style.backgroundColor = "red";
    function change_size() {
        var size = parseInt(div.style.width) + 10;
        var color = div.style.backgroundColor;
        if (size > 420)
            size = 200;
        if (color === "red")
            color = "green";
        else if (color === "green")
            color = "blue";
        else if (color === "blue")
            color = "red";
        console.log(size);
        div.style.width = size + "px";
        div.style.height = size + "px";
        div.style.backgroundColor = color;
    }
    function shrinc() {
        var size = parseInt(div.style.width) - 5;
        var color = div.style.backgroundColor;
        if (size <= 200)
            size = 200;
        if (color === "red")
            color = "blue";
        else if (color === "blue")
            color = "green";
        else if (color === "green")
            color = "red";
        console.log(size);
        div.style.width = size + "px";
        div.style.height = size + "px";
        div.style.backgroundColor = color;
    }
</script>
</html>