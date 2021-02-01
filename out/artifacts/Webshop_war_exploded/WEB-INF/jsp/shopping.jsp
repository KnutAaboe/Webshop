<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lets start shopping</title>
</head>
<h1>Welcome </h1> <%-- Say "welcome ... (name) later --%>
<form action="ShoppingCart" method="post">
    <fieldset>
        <p><input type="text" name="item"/></p>
        <button type="submit">Add item</button>
    </fieldset>
</form>

<p><strong>Your shopping list:</strong></p>
<c:forEach items="${cart}" var="item">
    <p>Item = ${item.items}</p>
</c:forEach>
<%--    <p>${unit}</p>--%>



</body>
</html>
